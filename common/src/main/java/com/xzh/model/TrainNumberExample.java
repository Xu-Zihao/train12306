package com.xzh.model;

import java.util.ArrayList;
import java.util.List;

public class TrainNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainNumberExample() {
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

        public Criteria andTrainTypeIsNull() {
            addCriterion("train_type is null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIsNotNull() {
            addCriterion("train_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeEqualTo(String value) {
            addCriterion("train_type =", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotEqualTo(String value) {
            addCriterion("train_type <>", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThan(String value) {
            addCriterion("train_type >", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("train_type >=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThan(String value) {
            addCriterion("train_type <", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThanOrEqualTo(String value) {
            addCriterion("train_type <=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLike(String value) {
            addCriterion("train_type like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotLike(String value) {
            addCriterion("train_type not like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIn(List<String> values) {
            addCriterion("train_type in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotIn(List<String> values) {
            addCriterion("train_type not in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeBetween(String value1, String value2) {
            addCriterion("train_type between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotBetween(String value1, String value2) {
            addCriterion("train_type not between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSeatNumIsNull() {
            addCriterion("seat_num is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumIsNotNull() {
            addCriterion("seat_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumEqualTo(Integer value) {
            addCriterion("seat_num =", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotEqualTo(Integer value) {
            addCriterion("seat_num <>", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThan(Integer value) {
            addCriterion("seat_num >", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_num >=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThan(Integer value) {
            addCriterion("seat_num <", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumLessThanOrEqualTo(Integer value) {
            addCriterion("seat_num <=", value, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumIn(List<Integer> values) {
            addCriterion("seat_num in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotIn(List<Integer> values) {
            addCriterion("seat_num not in", values, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumBetween(Integer value1, Integer value2) {
            addCriterion("seat_num between", value1, value2, "seatNum");
            return (Criteria) this;
        }

        public Criteria andSeatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_num not between", value1, value2, "seatNum");
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