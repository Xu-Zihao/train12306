package com.xzh.model;

import java.util.ArrayList;
import java.util.List;

public class TrainNumberDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainNumberDetailExample() {
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

        public Criteria andTrainNumberIdIsNull() {
            addCriterion("train_number_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdIsNotNull() {
            addCriterion("train_number_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdEqualTo(Integer value) {
            addCriterion("train_number_id =", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdNotEqualTo(Integer value) {
            addCriterion("train_number_id <>", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdGreaterThan(Integer value) {
            addCriterion("train_number_id >", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_number_id >=", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdLessThan(Integer value) {
            addCriterion("train_number_id <", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdLessThanOrEqualTo(Integer value) {
            addCriterion("train_number_id <=", value, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdIn(List<Integer> values) {
            addCriterion("train_number_id in", values, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdNotIn(List<Integer> values) {
            addCriterion("train_number_id not in", values, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdBetween(Integer value1, Integer value2) {
            addCriterion("train_number_id between", value1, value2, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("train_number_id not between", value1, value2, "trainNumberId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIsNull() {
            addCriterion("from_station_id is null");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIsNotNull() {
            addCriterion("from_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromStationIdEqualTo(Integer value) {
            addCriterion("from_station_id =", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotEqualTo(Integer value) {
            addCriterion("from_station_id <>", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdGreaterThan(Integer value) {
            addCriterion("from_station_id >", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_station_id >=", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdLessThan(Integer value) {
            addCriterion("from_station_id <", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_station_id <=", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIn(List<Integer> values) {
            addCriterion("from_station_id in", values, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotIn(List<Integer> values) {
            addCriterion("from_station_id not in", values, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdBetween(Integer value1, Integer value2) {
            addCriterion("from_station_id between", value1, value2, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_station_id not between", value1, value2, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdIsNull() {
            addCriterion("from_city_id is null");
            return (Criteria) this;
        }

        public Criteria andFromCityIdIsNotNull() {
            addCriterion("from_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromCityIdEqualTo(Integer value) {
            addCriterion("from_city_id =", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdNotEqualTo(Integer value) {
            addCriterion("from_city_id <>", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdGreaterThan(Integer value) {
            addCriterion("from_city_id >", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_city_id >=", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdLessThan(Integer value) {
            addCriterion("from_city_id <", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_city_id <=", value, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdIn(List<Integer> values) {
            addCriterion("from_city_id in", values, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdNotIn(List<Integer> values) {
            addCriterion("from_city_id not in", values, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdBetween(Integer value1, Integer value2) {
            addCriterion("from_city_id between", value1, value2, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andFromCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_city_id not between", value1, value2, "fromCityId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNull() {
            addCriterion("to_station_id is null");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNotNull() {
            addCriterion("to_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andToStationIdEqualTo(Integer value) {
            addCriterion("to_station_id =", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotEqualTo(Integer value) {
            addCriterion("to_station_id <>", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThan(Integer value) {
            addCriterion("to_station_id >", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_station_id >=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThan(Integer value) {
            addCriterion("to_station_id <", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_station_id <=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIn(List<Integer> values) {
            addCriterion("to_station_id in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotIn(List<Integer> values) {
            addCriterion("to_station_id not in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdBetween(Integer value1, Integer value2) {
            addCriterion("to_station_id between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_station_id not between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToCityIdIsNull() {
            addCriterion("to_city_id is null");
            return (Criteria) this;
        }

        public Criteria andToCityIdIsNotNull() {
            addCriterion("to_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andToCityIdEqualTo(Integer value) {
            addCriterion("to_city_id =", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdNotEqualTo(Integer value) {
            addCriterion("to_city_id <>", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdGreaterThan(Integer value) {
            addCriterion("to_city_id >", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_city_id >=", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdLessThan(Integer value) {
            addCriterion("to_city_id <", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_city_id <=", value, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdIn(List<Integer> values) {
            addCriterion("to_city_id in", values, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdNotIn(List<Integer> values) {
            addCriterion("to_city_id not in", values, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdBetween(Integer value1, Integer value2) {
            addCriterion("to_city_id between", value1, value2, "toCityId");
            return (Criteria) this;
        }

        public Criteria andToCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_city_id not between", value1, value2, "toCityId");
            return (Criteria) this;
        }

        public Criteria andStationIndexIsNull() {
            addCriterion("station_index is null");
            return (Criteria) this;
        }

        public Criteria andStationIndexIsNotNull() {
            addCriterion("station_index is not null");
            return (Criteria) this;
        }

        public Criteria andStationIndexEqualTo(Integer value) {
            addCriterion("station_index =", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexNotEqualTo(Integer value) {
            addCriterion("station_index <>", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexGreaterThan(Integer value) {
            addCriterion("station_index >", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_index >=", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexLessThan(Integer value) {
            addCriterion("station_index <", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexLessThanOrEqualTo(Integer value) {
            addCriterion("station_index <=", value, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexIn(List<Integer> values) {
            addCriterion("station_index in", values, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexNotIn(List<Integer> values) {
            addCriterion("station_index not in", values, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexBetween(Integer value1, Integer value2) {
            addCriterion("station_index between", value1, value2, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andStationIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("station_index not between", value1, value2, "stationIndex");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteIsNull() {
            addCriterion("relative_minute is null");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteIsNotNull() {
            addCriterion("relative_minute is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteEqualTo(Integer value) {
            addCriterion("relative_minute =", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteNotEqualTo(Integer value) {
            addCriterion("relative_minute <>", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteGreaterThan(Integer value) {
            addCriterion("relative_minute >", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("relative_minute >=", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteLessThan(Integer value) {
            addCriterion("relative_minute <", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("relative_minute <=", value, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteIn(List<Integer> values) {
            addCriterion("relative_minute in", values, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteNotIn(List<Integer> values) {
            addCriterion("relative_minute not in", values, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteBetween(Integer value1, Integer value2) {
            addCriterion("relative_minute between", value1, value2, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andRelativeMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("relative_minute not between", value1, value2, "relativeMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteIsNull() {
            addCriterion("wait_minute is null");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteIsNotNull() {
            addCriterion("wait_minute is not null");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteEqualTo(Integer value) {
            addCriterion("wait_minute =", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteNotEqualTo(Integer value) {
            addCriterion("wait_minute <>", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteGreaterThan(Integer value) {
            addCriterion("wait_minute >", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_minute >=", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteLessThan(Integer value) {
            addCriterion("wait_minute <", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("wait_minute <=", value, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteIn(List<Integer> values) {
            addCriterion("wait_minute in", values, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteNotIn(List<Integer> values) {
            addCriterion("wait_minute not in", values, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteBetween(Integer value1, Integer value2) {
            addCriterion("wait_minute between", value1, value2, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andWaitMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_minute not between", value1, value2, "waitMinute");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
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