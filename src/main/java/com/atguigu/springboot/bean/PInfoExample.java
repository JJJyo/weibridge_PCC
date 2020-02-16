package com.atguigu.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class PInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PInfoExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalIsNull() {
            addCriterion("p_picturelocal is null");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalIsNotNull() {
            addCriterion("p_picturelocal is not null");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalEqualTo(String value) {
            addCriterion("p_picturelocal =", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalNotEqualTo(String value) {
            addCriterion("p_picturelocal <>", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalGreaterThan(String value) {
            addCriterion("p_picturelocal >", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalGreaterThanOrEqualTo(String value) {
            addCriterion("p_picturelocal >=", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalLessThan(String value) {
            addCriterion("p_picturelocal <", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalLessThanOrEqualTo(String value) {
            addCriterion("p_picturelocal <=", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalLike(String value) {
            addCriterion("p_picturelocal like", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalNotLike(String value) {
            addCriterion("p_picturelocal not like", value, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalIn(List<String> values) {
            addCriterion("p_picturelocal in", values, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalNotIn(List<String> values) {
            addCriterion("p_picturelocal not in", values, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalBetween(String value1, String value2) {
            addCriterion("p_picturelocal between", value1, value2, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPPicturelocalNotBetween(String value1, String value2) {
            addCriterion("p_picturelocal not between", value1, value2, "pPicturelocal");
            return (Criteria) this;
        }

        public Criteria andPTimeIsNull() {
            addCriterion("p_time is null");
            return (Criteria) this;
        }

        public Criteria andPTimeIsNotNull() {
            addCriterion("p_time is not null");
            return (Criteria) this;
        }

        public Criteria andPTimeEqualTo(String value) {
            addCriterion("p_time =", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotEqualTo(String value) {
            addCriterion("p_time <>", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThan(String value) {
            addCriterion("p_time >", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_time >=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThan(String value) {
            addCriterion("p_time <", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLessThanOrEqualTo(String value) {
            addCriterion("p_time <=", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeLike(String value) {
            addCriterion("p_time like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotLike(String value) {
            addCriterion("p_time not like", value, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeIn(List<String> values) {
            addCriterion("p_time in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotIn(List<String> values) {
            addCriterion("p_time not in", values, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeBetween(String value1, String value2) {
            addCriterion("p_time between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andPTimeNotBetween(String value1, String value2) {
            addCriterion("p_time not between", value1, value2, "pTime");
            return (Criteria) this;
        }

        public Criteria andPLocalIsNull() {
            addCriterion("p_local is null");
            return (Criteria) this;
        }

        public Criteria andPLocalIsNotNull() {
            addCriterion("p_local is not null");
            return (Criteria) this;
        }

        public Criteria andPLocalEqualTo(Integer value) {
            addCriterion("p_local =", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalNotEqualTo(Integer value) {
            addCriterion("p_local <>", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalGreaterThan(Integer value) {
            addCriterion("p_local >", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_local >=", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalLessThan(Integer value) {
            addCriterion("p_local <", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalLessThanOrEqualTo(Integer value) {
            addCriterion("p_local <=", value, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalIn(List<Integer> values) {
            addCriterion("p_local in", values, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalNotIn(List<Integer> values) {
            addCriterion("p_local not in", values, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalBetween(Integer value1, Integer value2) {
            addCriterion("p_local between", value1, value2, "pLocal");
            return (Criteria) this;
        }

        public Criteria andPLocalNotBetween(Integer value1, Integer value2) {
            addCriterion("p_local not between", value1, value2, "pLocal");
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