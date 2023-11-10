#创建数据模型
create schema contract_manage_system;
use contract_manage_system;
#创建base_user数据表
drop table base_user;
create table base_user
(
    user_id             bigint(20) auto_increment      not null comment '用户编号',
    user_name           varchar(20) comment '用户姓名',
    user_login_id       varchar(20) comment '用户登录编号',
    user_login_password varchar(20) comment '用户登录密码',
    user_class          ENUM ('A', 'B', 'C', 'D', 'E') not null default 'E' comment '用户等级',
    is_delete           ENUM ('0', '1')                not null default '0' comment '是否已销户',
    create_person       bigint(20)                     not null comment '创建人编号',
    create_date         datetime                       not null comment '创建时间',
    last_modify_person  bigint(20)                     not null comment '最后修改人编号',
    last_modify_date    datetime                       not null comment '最后修改时间',
    constraint cons_pk primary key (user_id)
) comment = '用户信息表';

#创建资源数据表
create table base_resource
(
    resource_id        bigint(20) not null comment '资源编号',
    resource_name      varchar(20) comment '资源品名',
    resource_type      varchar(20) comment '资源型号',
    resource_spec      varchar(20) comment '资源规格',
    create_person      bigint(20) not null comment '创建人编号',
    create_date        datetime   not null comment '创建时间',
    last_modify_person bigint(20) not null comment '最后修改人编号',
    last_modify_date   datetime   not null comment '最后修改时间',
    constraint cons_pk primary key (resource_id)
) comment = '资源数据表';

#创建企业单位表
drop table base_org;
create table base_org
(
    org_id             bigint(20) not null comment '企业编号',
    org_name           varchar(20) comment '企业名称',
    org_address        varchar(235) comment '企业地址',
    org_phone          bigint(20) comment '企业电话',
    org_fax            bigint(20) comment '企业传真',
    org_represent      bigint(20) comment '企业代表人编号',
    org_mail           bigint(20) comment '企业邮政编号',
    org_bank           varchar(40) comment '企业银行账户开户地址',
    org_bank_account   bigint(20) comment '企业银行账户编号',
    create_person      bigint(20) not null comment '创建人编号',
    create_date        datetime   not null comment '创建时间',
    last_modify_person bigint(20) not null comment '最后修改人编号',
    last_modify_date   datetime   not null comment '最后修改时间',
    constraint cons_pk primary key (org_id)
) comment = '企业单位表';

#创建合同表
create table cms_contract
(
    contract_id        bigint(20) not null comment '合同编号',
    order_org_id       bigint(20) comment '订单企业编号',
    supply_org_id      bigint(20) comment '供货企业编号',
    receive_org_id     bigint(20) comment '收货单位编号',
    settle_org_id      bigint(20) comment '结算单位编号',
    resource_id        bigint(20) comment '资源编号',
    resource_quality   decimal(10, 2) comment '资源数量',
    resource_date      datetime comment '交货时间',
    contract_term      varchar(400) comment '合同条款',
    create_person      bigint(20) not null comment '创建人编号',
    create_date        datetime   not null comment '创建时间',
    last_modify_person bigint(20) not null comment '最后修改人编号',
    last_modify_date   datetime   not null comment '最后修改时间',
    edit_type          ENUM ('0', '1', '2', '3', '4') comment '编写状态',
    constraint cons_pk primary key (contract_id)
) comment = '合同表';

#创建发票表
drop table cms_invoice;
create table cms_invoice
(
    invoice_id          bigint(20) not null auto_increment comment '发票编号',
    contract_id         bigint(20) not null comment '合同编号',
    invoice_quantity    decimal(20, 2) comment '货物数量',
    invoice_unit_price  decimal(20, 2) comment '单价',
    invoice_price       decimal(20, 2) comment '金额',
    invoice_tax_percent decimal(20, 2) comment '税率',
    invoice_tax         decimal(20, 2) comment '税额',
    invoice_total       decimal(20, 2) comment '价税合计',
    create_person       bigint(20) not null comment '创建人编号',
    create_date         datetime   not null comment '创建时间',
    last_modify_person  bigint(20) not null comment '最后修改人编号',
    last_modify_date    datetime   not null comment '最后修改时间',
    constraint cons_pk primary key (invoice_id)
) comment = '发票明细表';

#创建企业资源表
create table cms_org_resource
(
    org_resource_id    bigint(20) not null comment '供货单位资源编号',
    org_id             bigint(20) comment '企业单位编号',
    resource_id        bigint(20) comment '资源编号',
    status             ENUM ('0', '1') comment '可用状态',
    create_person      bigint(20) not null comment '创建人编号',
    create_date        datetime   not null comment '创建时间',
    last_modify_person bigint(20) not null comment '最后修改人编号',
    last_modify_date   datetime   not null comment '最后修改时间',
    constraint cons_pk primary key (org_resource_id)
) comment = '企业资源表';