package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class FacedataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacedataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andDatasizeIsNull() {
            addCriterion("dataSize is null");
            return (Criteria) this;
        }

        public Criteria andDatasizeIsNotNull() {
            addCriterion("dataSize is not null");
            return (Criteria) this;
        }

        public Criteria andDatasizeEqualTo(Integer value) {
            addCriterion("dataSize =", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeNotEqualTo(Integer value) {
            addCriterion("dataSize <>", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeGreaterThan(Integer value) {
            addCriterion("dataSize >", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataSize >=", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeLessThan(Integer value) {
            addCriterion("dataSize <", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeLessThanOrEqualTo(Integer value) {
            addCriterion("dataSize <=", value, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeIn(List<Integer> values) {
            addCriterion("dataSize in", values, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeNotIn(List<Integer> values) {
            addCriterion("dataSize not in", values, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeBetween(Integer value1, Integer value2) {
            addCriterion("dataSize between", value1, value2, "datasize");
            return (Criteria) this;
        }

        public Criteria andDatasizeNotBetween(Integer value1, Integer value2) {
            addCriterion("dataSize not between", value1, value2, "datasize");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeIsNull() {
            addCriterion("terminalTime is null");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeIsNotNull() {
            addCriterion("terminalTime is not null");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeEqualTo(String value) {
            addCriterion("terminalTime =", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeNotEqualTo(String value) {
            addCriterion("terminalTime <>", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeGreaterThan(String value) {
            addCriterion("terminalTime >", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeGreaterThanOrEqualTo(String value) {
            addCriterion("terminalTime >=", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeLessThan(String value) {
            addCriterion("terminalTime <", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeLessThanOrEqualTo(String value) {
            addCriterion("terminalTime <=", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeLike(String value) {
            addCriterion("terminalTime like", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeNotLike(String value) {
            addCriterion("terminalTime not like", value, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeIn(List<String> values) {
            addCriterion("terminalTime in", values, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeNotIn(List<String> values) {
            addCriterion("terminalTime not in", values, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeBetween(String value1, String value2) {
            addCriterion("terminalTime between", value1, value2, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andTerminaltimeNotBetween(String value1, String value2) {
            addCriterion("terminalTime not between", value1, value2, "terminaltime");
            return (Criteria) this;
        }

        public Criteria andCameraipIsNull() {
            addCriterion("cameraIP is null");
            return (Criteria) this;
        }

        public Criteria andCameraipIsNotNull() {
            addCriterion("cameraIP is not null");
            return (Criteria) this;
        }

        public Criteria andCameraipEqualTo(String value) {
            addCriterion("cameraIP =", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipNotEqualTo(String value) {
            addCriterion("cameraIP <>", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipGreaterThan(String value) {
            addCriterion("cameraIP >", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipGreaterThanOrEqualTo(String value) {
            addCriterion("cameraIP >=", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipLessThan(String value) {
            addCriterion("cameraIP <", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipLessThanOrEqualTo(String value) {
            addCriterion("cameraIP <=", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipLike(String value) {
            addCriterion("cameraIP like", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipNotLike(String value) {
            addCriterion("cameraIP not like", value, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipIn(List<String> values) {
            addCriterion("cameraIP in", values, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipNotIn(List<String> values) {
            addCriterion("cameraIP not in", values, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipBetween(String value1, String value2) {
            addCriterion("cameraIP between", value1, value2, "cameraip");
            return (Criteria) this;
        }

        public Criteria andCameraipNotBetween(String value1, String value2) {
            addCriterion("cameraIP not between", value1, value2, "cameraip");
            return (Criteria) this;
        }

        public Criteria andMacipIsNull() {
            addCriterion("macIP is null");
            return (Criteria) this;
        }

        public Criteria andMacipIsNotNull() {
            addCriterion("macIP is not null");
            return (Criteria) this;
        }

        public Criteria andMacipEqualTo(String value) {
            addCriterion("macIP =", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipNotEqualTo(String value) {
            addCriterion("macIP <>", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipGreaterThan(String value) {
            addCriterion("macIP >", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipGreaterThanOrEqualTo(String value) {
            addCriterion("macIP >=", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipLessThan(String value) {
            addCriterion("macIP <", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipLessThanOrEqualTo(String value) {
            addCriterion("macIP <=", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipLike(String value) {
            addCriterion("macIP like", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipNotLike(String value) {
            addCriterion("macIP not like", value, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipIn(List<String> values) {
            addCriterion("macIP in", values, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipNotIn(List<String> values) {
            addCriterion("macIP not in", values, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipBetween(String value1, String value2) {
            addCriterion("macIP between", value1, value2, "macip");
            return (Criteria) this;
        }

        public Criteria andMacipNotBetween(String value1, String value2) {
            addCriterion("macIP not between", value1, value2, "macip");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}