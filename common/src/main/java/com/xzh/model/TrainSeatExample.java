package com.xzh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainSeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainSeatExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTicketIsNull() {
            addCriterion("ticket is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("ticket is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(String value) {
            addCriterion("ticket =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(String value) {
            addCriterion("ticket <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(String value) {
            addCriterion("ticket >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(String value) {
            addCriterion("ticket >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(String value) {
            addCriterion("ticket <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(String value) {
            addCriterion("ticket <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLike(String value) {
            addCriterion("ticket like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotLike(String value) {
            addCriterion("ticket not like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<String> values) {
            addCriterion("ticket in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<String> values) {
            addCriterion("ticket not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(String value1, String value2) {
            addCriterion("ticket between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(String value1, String value2) {
            addCriterion("ticket not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIsNull() {
            addCriterion("traveller_id is null");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIsNotNull() {
            addCriterion("traveller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravellerIdEqualTo(Long value) {
            addCriterion("traveller_id =", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotEqualTo(Long value) {
            addCriterion("traveller_id <>", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdGreaterThan(Long value) {
            addCriterion("traveller_id >", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("traveller_id >=", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdLessThan(Long value) {
            addCriterion("traveller_id <", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdLessThanOrEqualTo(Long value) {
            addCriterion("traveller_id <=", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIn(List<Long> values) {
            addCriterion("traveller_id in", values, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotIn(List<Long> values) {
            addCriterion("traveller_id not in", values, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdBetween(Long value1, Long value2) {
            addCriterion("traveller_id between", value1, value2, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotBetween(Long value1, Long value2) {
            addCriterion("traveller_id not between", value1, value2, "travellerId");
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

        public Criteria andCarriageNumberIsNull() {
            addCriterion("carriage_number is null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberIsNotNull() {
            addCriterion("carriage_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberEqualTo(Integer value) {
            addCriterion("carriage_number =", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotEqualTo(Integer value) {
            addCriterion("carriage_number <>", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberGreaterThan(Integer value) {
            addCriterion("carriage_number >", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("carriage_number >=", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberLessThan(Integer value) {
            addCriterion("carriage_number <", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberLessThanOrEqualTo(Integer value) {
            addCriterion("carriage_number <=", value, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberIn(List<Integer> values) {
            addCriterion("carriage_number in", values, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotIn(List<Integer> values) {
            addCriterion("carriage_number not in", values, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberBetween(Integer value1, Integer value2) {
            addCriterion("carriage_number between", value1, value2, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andCarriageNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("carriage_number not between", value1, value2, "carriageNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberIsNull() {
            addCriterion("row_number is null");
            return (Criteria) this;
        }

        public Criteria andRowNumberIsNotNull() {
            addCriterion("row_number is not null");
            return (Criteria) this;
        }

        public Criteria andRowNumberEqualTo(Integer value) {
            addCriterion("row_number =", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotEqualTo(Integer value) {
            addCriterion("row_number <>", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberGreaterThan(Integer value) {
            addCriterion("row_number >", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_number >=", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberLessThan(Integer value) {
            addCriterion("row_number <", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberLessThanOrEqualTo(Integer value) {
            addCriterion("row_number <=", value, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberIn(List<Integer> values) {
            addCriterion("row_number in", values, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotIn(List<Integer> values) {
            addCriterion("row_number not in", values, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberBetween(Integer value1, Integer value2) {
            addCriterion("row_number between", value1, value2, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andRowNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("row_number not between", value1, value2, "rowNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNull() {
            addCriterion("seat_number is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNotNull() {
            addCriterion("seat_number is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberEqualTo(Integer value) {
            addCriterion("seat_number =", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotEqualTo(Integer value) {
            addCriterion("seat_number <>", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThan(Integer value) {
            addCriterion("seat_number >", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_number >=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThan(Integer value) {
            addCriterion("seat_number <", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThanOrEqualTo(Integer value) {
            addCriterion("seat_number <=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIn(List<Integer> values) {
            addCriterion("seat_number in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotIn(List<Integer> values) {
            addCriterion("seat_number not in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberBetween(Integer value1, Integer value2) {
            addCriterion("seat_number between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_number not between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIsNull() {
            addCriterion("seat_level is null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIsNotNull() {
            addCriterion("seat_level is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelEqualTo(Integer value) {
            addCriterion("seat_level =", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotEqualTo(Integer value) {
            addCriterion("seat_level <>", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThan(Integer value) {
            addCriterion("seat_level >", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_level >=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThan(Integer value) {
            addCriterion("seat_level <", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThanOrEqualTo(Integer value) {
            addCriterion("seat_level <=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIn(List<Integer> values) {
            addCriterion("seat_level in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotIn(List<Integer> values) {
            addCriterion("seat_level not in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelBetween(Integer value1, Integer value2) {
            addCriterion("seat_level between", value1, value2, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_level not between", value1, value2, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andTrainStartIsNull() {
            addCriterion("train_start is null");
            return (Criteria) this;
        }

        public Criteria andTrainStartIsNotNull() {
            addCriterion("train_start is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStartEqualTo(Date value) {
            addCriterion("train_start =", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotEqualTo(Date value) {
            addCriterion("train_start <>", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartGreaterThan(Date value) {
            addCriterion("train_start >", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartGreaterThanOrEqualTo(Date value) {
            addCriterion("train_start >=", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartLessThan(Date value) {
            addCriterion("train_start <", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartLessThanOrEqualTo(Date value) {
            addCriterion("train_start <=", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartIn(List<Date> values) {
            addCriterion("train_start in", values, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotIn(List<Date> values) {
            addCriterion("train_start not in", values, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartBetween(Date value1, Date value2) {
            addCriterion("train_start between", value1, value2, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotBetween(Date value1, Date value2) {
            addCriterion("train_start not between", value1, value2, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNull() {
            addCriterion("train_end is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNotNull() {
            addCriterion("train_end is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndEqualTo(Date value) {
            addCriterion("train_end =", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotEqualTo(Date value) {
            addCriterion("train_end <>", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThan(Date value) {
            addCriterion("train_end >", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThanOrEqualTo(Date value) {
            addCriterion("train_end >=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThan(Date value) {
            addCriterion("train_end <", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThanOrEqualTo(Date value) {
            addCriterion("train_end <=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndIn(List<Date> values) {
            addCriterion("train_end in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotIn(List<Date> values) {
            addCriterion("train_end not in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndBetween(Date value1, Date value2) {
            addCriterion("train_end between", value1, value2, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotBetween(Date value1, Date value2) {
            addCriterion("train_end not between", value1, value2, "trainEnd");
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

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andShowNumberIsNull() {
            addCriterion("show_number is null");
            return (Criteria) this;
        }

        public Criteria andShowNumberIsNotNull() {
            addCriterion("show_number is not null");
            return (Criteria) this;
        }

        public Criteria andShowNumberEqualTo(String value) {
            addCriterion("show_number =", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotEqualTo(String value) {
            addCriterion("show_number <>", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberGreaterThan(String value) {
            addCriterion("show_number >", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberGreaterThanOrEqualTo(String value) {
            addCriterion("show_number >=", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberLessThan(String value) {
            addCriterion("show_number <", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberLessThanOrEqualTo(String value) {
            addCriterion("show_number <=", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberLike(String value) {
            addCriterion("show_number like", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotLike(String value) {
            addCriterion("show_number not like", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberIn(List<String> values) {
            addCriterion("show_number in", values, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotIn(List<String> values) {
            addCriterion("show_number not in", values, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberBetween(String value1, String value2) {
            addCriterion("show_number between", value1, value2, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotBetween(String value1, String value2) {
            addCriterion("show_number not between", value1, value2, "showNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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