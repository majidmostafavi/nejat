package entity;


import utils.IndependentType;
import utils.Treeable;
import javax.persistence.*;

@Entity
@Table(name = "CO_ORGANIZATION")
@TableGenerator(name = "OrganizationSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_ORGANIZATION" )
@NamedQueries({
        @NamedQuery(name = "findByOrganizationName",query = "select organization from CoOrganization organization where organization.name like :name and organization.active=:active"),
        @NamedQuery(name = "findListByOrganizationName",query = "select organization from CoOrganization organization where organization.name like :name and organization.pathCode like:path and organization.active=:active order by organization.codeDigit asc "),
        @NamedQuery(name = "findListByOrganizationCode",query = "select organization from CoOrganization organization where organization.codeDigit=:code and organization.pathCode like:path and organization.active=:active order by organization.codeDigit asc "),
        @NamedQuery(name = "findOrganizationByParent", query = "select organization from CoOrganization organization where organization.parent=:parent and organization.active=:active order by organization.name "),
        @NamedQuery(name = "findOrganizationByChildren" , query = "select organization from CoOrganization organization where organization.parent=:parent and organization.active=:active"),
        @NamedQuery(name = "findOrganizationByCode", query = "select organization from CoOrganization organization where organization.codeDigit=:code  and organization.active=:active order by organization.name "),
        @NamedQuery(name = "findOrganizationByPath",query = "select organization from CoOrganization organization where organization.pathCode like :path and organization.active=:active"),
        @NamedQuery(name = "findAllOrganization",query = "select organization from CoOrganization organization where (organization.pathCode like:path or organization.id=:id) and organization.active=:active order by organization.codeDigit asc "),
        @NamedQuery(name = "findOrganizationByPathcode",query = "select organization from CoOrganization organization where organization.pathCode like :code and organization.active=:active"),
        @NamedQuery(name = "countOrganizationByNameOrCodeForEdit" , query = "select count (organization) from CoOrganization organization where organization.id not in :id and (organization.name=:name or organization.codeDigit=:code) and organization.parent=:parent and organization.active=:active"),
        @NamedQuery(name = "countOrganizationByNameOrCode" , query = "select count (organization) from CoOrganization organization where (organization.name=:name or organization.codeDigit=:code) and organization.parent=:parent and organization.active=:active"),
        @NamedQuery(name = "findAllOrganizationWithAccountingType",query = "select organization from CoOrganization organization where organization.id in (select accountingTypeOrganization.organization.id from AcAccountingTypeOrganization accountingTypeOrganization) and organization.pathCode like:path and organization.active=:active"),
        @NamedQuery(name = "findByIndependentAccounting",query = "select organization from CoOrganization organization where organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findByIndependentAccountingWihoutCurrentOrganization",query = "select organization from CoOrganization organization where organization.id != :id and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findByListNotifyMaster",query = "select organization from CoOrganization organization where organization.active=:active and organization.id in(select documentSubDetail.independentId from AcDocumentSubDetail documentSubDetail where documentSubDetail.documentDetail in(select documentDetail from AcDocumentDetail documentDetail where documentDetail in(select notifyDetail.documentDetail from TrNotifyDetail notifyDetail where notifyDetail.notifyMaster=:notifyMaster))and documentSubDetail.clazz=:clazz)"),
        @NamedQuery(name = "findListIndependentAccountingByName", query = "select organization from CoOrganization organization where organization.name like :name and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findListIndependentAccountingByCode", query = "select organization from CoOrganization organization where organization.codeDigit=:code and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "countByOrganizationKind", query = "select count(organization) from CoOrganization  organization where organization.organizationKind=:organizationKind"),
        @NamedQuery(name = "findOrganizationByIndependentAccounting",query = "select organization from CoOrganization organization where organization.pathCode like :pathCode and organization.organizationNatureEnum =:organizationNature and organization.active=:active order by organization.codeDigit asc"),
        @NamedQuery(name = "findOrganizationsByIndependentAccounting",query = "select organization from CoOrganization organization where organization.organizationNatureEnum =:organizationNature and organization.active=:active order by organization.codeDigit asc"),
        @NamedQuery(name = "findOrganizationByIndependentAccountingOrderByPath",query = "select organization from CoOrganization organization where organization.pathCode like :pathCode and organization.organizationNatureEnum =:organizationNature and organization.active=:active order by organization.pathCode asc"),
        @NamedQuery(name = "findIndependentAccountOrganizationsByName",query = "select organization from CoOrganization organization where organization.name like :name and organization.pathCode like :pathCode and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findIndependentAccountOrganizationsByCode",query = "select organization from CoOrganization organization where organization.codeDigit=:code and organization.pathCode like :pathCode and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findIndependentAccountOrgByName",query = "select organization from CoOrganization organization where organization.name like :name and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findIndependentAccountOrgByCode",query = "select organization from CoOrganization organization where organization.codeDigit=:code and organization.organizationNatureEnum =:organizationNature and organization.active=:active"),
        @NamedQuery(name = "findCostCenterByOrganization" , query = "select organization.costCenter from CoOrganization organization where organization=:organization and organization.active=:active"),
        @NamedQuery(name = "countActiveChildOrganizationByParent", query = "select count(organization) from CoOrganization organization inner join organization.children child where child.pathCode like :pathCode and child.active=true "),
        @NamedQuery(name = "findOrganizationByIndependentAccountingOrDependent",query = "select organization from CoOrganization organization where organization.pathCode like :pathCode and (organization.organizationNatureEnum =:organizationNature or organization.organizationNatureEnum =:secondOrganizationNature) and organization.active=:active order by organization.codeDigit asc"),
        @NamedQuery(name = "findOrganizationByDependent",query = "select organization from CoOrganization organization where organization.pathCode like :pathCode and organization.organizationNatureEnum =:organizationNature and organization.active=:active order by organization.pathCode asc"),
})
@Cacheable
@IndependentType(independentType = "getOrganizationType")
public class CoOrganization extends AbstractCoOrganization implements Treeable {
    public CoOrganization() {
    }
}
