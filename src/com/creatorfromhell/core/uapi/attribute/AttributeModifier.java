package com.creatorfromhell.core.uapi.attribute;

import java.util.UUID;

public class AttributeModifier {

  private UUID id;
  private String name;
  private double amount;
  private AttributeOperation operation;

  public AttributeModifier() {

  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public AttributeOperation getOperation() {
    return operation;
  }

  public void setOperation(AttributeOperation operation) {
    this.operation = operation;
  }
}