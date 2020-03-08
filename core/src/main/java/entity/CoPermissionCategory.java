package entity;

import javax.persistence.*;

/**
 * Created by majid on 6/25/16.
 */
@Entity
@Cacheable
@Table(name = "CO_PERMISSION_CATEGORY")
@TableGenerator(name = "PERMISSIONCATEGORYSequenceGenerator" ,
        table = "CO_SEQUENCE" , pkColumnName = "TABLENAME" , valueColumnName = "CURRENTID" , pkColumnValue = "CO_PERMISSION_CATEGORY" )
@NamedQueries({
        @NamedQuery(name = "existPermissionCategory", query = "select count(category) from CoPermissionCategory category where category.categoryName=:categoryName"),
        @NamedQuery(name = "findPermissionCategoryByName", query = "select category from CoPermissionCategory category where category.categoryName=:categoryName"),
        @NamedQuery(name = "findPermissionCategoryByCode", query = "select category from CoPermissionCategory category where category.code=:code"),
        @NamedQuery(name = "countPermissionCategoryByNameOrCode",query = "select count(category) from CoPermissionCategory category where category.categoryName=:name or category.code=:code"),
        @NamedQuery(name = "countPermissionCategoryByNameOrCodeForEdit",query = "select count(category) from CoPermissionCategory category where category.id not in :id and (category.categoryName like :name or category.code=:code)"),
        @NamedQuery(name = "findAllPermissionCategory",query = "select category from CoPermissionCategory category order by category.categoryName")
})
public class CoPermissionCategory extends AbstractCoPermissionCategory {

    public CoPermissionCategory() {
    }
}
