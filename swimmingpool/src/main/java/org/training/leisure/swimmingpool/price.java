package org.training.leisure.swimmingpool;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class price implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String description;
   private java.math.BigDecimal amount;
   private java.lang.String priceType;

   public price()
   {
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.math.BigDecimal getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.math.BigDecimal amount)
   {
      this.amount = amount;
   }

   public java.lang.String getPriceType()
   {
      return this.priceType;
   }

   public void setPriceType(java.lang.String priceType)
   {
      this.priceType = priceType;
   }

   public price(java.lang.String description, java.math.BigDecimal amount,
         java.lang.String priceType)
   {
      this.description = description;
      this.amount = amount;
      this.priceType = priceType;
   }

}