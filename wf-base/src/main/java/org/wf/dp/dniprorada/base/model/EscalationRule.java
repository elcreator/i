package org.wf.dp.dniprorada.base.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class EscalationRule extends Entity {

    /** ИД-строка бизнеспроцесса (уникальный)     */
    @JsonProperty(value="sID_BP")
    @Column(unique = true)
    private String sID_BP;

    /**строка, до 200 символов ()     */
    @JsonProperty(value="sCondition")
    @Column(length = 200)
    private String sCondition;

    /**строка-обьект, с данніми (JSON-обьект), до 500 символов     */
    @JsonProperty(value="soData")
    @Column(length = 500)
    private String soData;

    /**строка файла-шаблона     */
    @JsonProperty(value="sPatternFile")
    @Column
    private String sPatternFile;

    /**ИД-номер функции ,при эскалации     */
    @JsonProperty(value="nID_EscalationRuleFunction")
    @ManyToOne(targetEntity = EscalationRuleFunction.class)//??, fetch = FetchType.EAGER)
    @JoinColumn(name = "nID_EscalationRuleFunction")
    private Long nID_EscalationRuleFunction;

    public String getsID_BP() {
        return sID_BP;
    }

    public void setsID_BP(String sID_BP) {
        this.sID_BP = sID_BP;
    }

    public String getsCondition() {
        return sCondition;
    }

    public void setsCondition(String sCondition) {
        this.sCondition = sCondition;
    }

    public String getSoData() {
        return soData;
    }

    public void setSoData(String soData) {
        this.soData = soData;
    }

    public String getsPatternFile() {
        return sPatternFile;
    }

    public void setsPatternFile(String sPatternFile) {
        this.sPatternFile = sPatternFile;
    }

    public Long getnID_EscalationRuleFunction() {
        return nID_EscalationRuleFunction;
    }

    public void setnID_EscalationRuleFunction(Long nID_EscalationRuleFunction) {
        this.nID_EscalationRuleFunction = nID_EscalationRuleFunction;
    }
}