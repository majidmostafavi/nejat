package entity;

import javax.persistence.*;

/**
 * Created by majid on 11/30/16.
 */
@MappedSuperclass
public abstract class AbstractCoUsecaseAction extends BaseEntity{
    private Long id;
    private CoUsecase usecase;
    private CoAction action;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "USECASEACTIONSequenceGenerator")
    @Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, precision = 10, scale = 0)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "USECASE_ID",foreignKey =@ForeignKey(name = "FK_USECASEACTION_USECASE"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoUsecase getUsecase() {
        return usecase;
    }
    public void setUsecase(CoUsecase usecase) {
        this.usecase = usecase;
    }

    @ManyToOne(cascade = {})
    @JoinColumn(name = "ACTION_ID",foreignKey =@ForeignKey(name = "FK_USECASEACTION_ACTION"), unique = false, nullable = false, insertable = true, updatable = true)
    public CoAction getAction() {
        return action;
    }
    public void setAction(CoAction action) {
        this.action = action;
    }
}
