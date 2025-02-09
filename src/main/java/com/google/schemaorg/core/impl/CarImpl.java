/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.schemaorg.core.impl;import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.Action;
import com.google.schemaorg.core.AggregateRating;
import com.google.schemaorg.core.Article;
import com.google.schemaorg.core.Audience;
import com.google.schemaorg.core.Brand;
import com.google.schemaorg.core.Car;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CreativeWork;
import com.google.schemaorg.core.Distance;
import com.google.schemaorg.core.DriveWheelConfigurationValue;
import com.google.schemaorg.core.EngineSpecification;
import com.google.schemaorg.core.ImageObject;
import com.google.schemaorg.core.Offer;
import com.google.schemaorg.core.OfferItemCondition;
import com.google.schemaorg.core.Organization;
import com.google.schemaorg.core.PhysicalActivityCategory;
import com.google.schemaorg.core.Product;
import com.google.schemaorg.core.ProductModel;
import com.google.schemaorg.core.PropertyValue;
import com.google.schemaorg.core.QualitativeValue;
import com.google.schemaorg.core.QuantitativeValue;
import com.google.schemaorg.core.Review;
import com.google.schemaorg.core.SteeringPositionValue;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Car}. */
public class CarImpl extends VehicleImpl implements Car {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_AWARDS);

    builder.add(CoreConstants.PROPERTY_BRAND);

    builder.add(CoreConstants.PROPERTY_CARGO_VOLUME);

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_COLOR);

    builder.add(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED);

    builder.add(CoreConstants.PROPERTY_DEPTH);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION);

    builder.add(CoreConstants.PROPERTY_FUEL_CONSUMPTION);

    builder.add(CoreConstants.PROPERTY_FUEL_EFFICIENCY);

    builder.add(CoreConstants.PROPERTY_FUEL_TYPE);

    builder.add(CoreConstants.PROPERTY_GTIN12);

    builder.add(CoreConstants.PROPERTY_GTIN13);

    builder.add(CoreConstants.PROPERTY_GTIN14);

    builder.add(CoreConstants.PROPERTY_GTIN8);

    builder.add(CoreConstants.PROPERTY_HEIGHT);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR);

    builder.add(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR);

    builder.add(CoreConstants.PROPERTY_IS_RELATED_TO);

    builder.add(CoreConstants.PROPERTY_IS_SIMILAR_TO);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER);

    builder.add(CoreConstants.PROPERTY_MODEL);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_AXLES);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_DOORS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRODUCT_ID);

    builder.add(CoreConstants.PROPERTY_PRODUCTION_DATE);

    builder.add(CoreConstants.PROPERTY_PURCHASE_DATE);

    builder.add(CoreConstants.PROPERTY_RELEASE_DATE);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SKU);

    builder.add(CoreConstants.PROPERTY_STEERING_POSITION);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION);

    builder.add(CoreConstants.PROPERTY_VEHICLE_ENGINE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR);

    builder.add(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY);

    builder.add(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION);

    builder.add(CoreConstants.PROPERTY_WEIGHT);

    builder.add(CoreConstants.PROPERTY_WIDTH);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  public static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Car.Builder>
      implements Car.Builder {

    @Override
    public Car.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public Car.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public Car.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public Car.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Car.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Car.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Car.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Car.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Car.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Car.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Car.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public Car.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public Car.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public Car.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Car.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Car.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Car.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Car.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Car.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Car.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Car.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Car.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Car.Builder addCargoVolume(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, value);
    }

    @Override
    public Car.Builder addCargoVolume(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, value.build());
    }

    @Override
    public Car.Builder addCargoVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, Text.of(value));
    }

    @Override
    public Car.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Car.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Car.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Car.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public Car.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public Car.Builder addColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, value);
    }

    @Override
    public Car.Builder addColor(String value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, Text.of(value));
    }

    @Override
    public Car.Builder addDateVehicleFirstRegistered(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED, value);
    }

    @Override
    public Car.Builder addDateVehicleFirstRegistered(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED, Text.of(value));
    }

    @Override
    public Car.Builder addDepth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Car.Builder addDepth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Car.Builder addDepth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Car.Builder addDepth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Car.Builder addDepth(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, Text.of(value));
    }

    @Override
    public Car.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Car.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Car.Builder addDriveWheelConfiguration(DriveWheelConfigurationValue value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, value);
    }

    @Override
    public Car.Builder addDriveWheelConfiguration(Text value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, value);
    }

    @Override
    public Car.Builder addDriveWheelConfiguration(String value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, Text.of(value));
    }

    @Override
    public Car.Builder addFuelConsumption(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, value);
    }

    @Override
    public Car.Builder addFuelConsumption(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, value.build());
    }

    @Override
    public Car.Builder addFuelConsumption(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, Text.of(value));
    }

    @Override
    public Car.Builder addFuelEfficiency(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, value);
    }

    @Override
    public Car.Builder addFuelEfficiency(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, value.build());
    }

    @Override
    public Car.Builder addFuelEfficiency(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, Text.of(value));
    }

    @Override
    public Car.Builder addFuelType(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Car.Builder addFuelType(Text value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Car.Builder addFuelType(URL value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Car.Builder addFuelType(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, Text.of(value));
    }

    @Override
    public Car.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public Car.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public Car.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public Car.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public Car.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public Car.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public Car.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public Car.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public Car.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Car.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Car.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Car.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Car.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public Car.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Car.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Car.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Car.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Car.Builder addIsAccessoryOrSparePartFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value);
    }

    @Override
    public Car.Builder addIsAccessoryOrSparePartFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value.build());
    }

    @Override
    public Car.Builder addIsAccessoryOrSparePartFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, Text.of(value));
    }

    @Override
    public Car.Builder addIsConsumableFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value);
    }

    @Override
    public Car.Builder addIsConsumableFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value.build());
    }

    @Override
    public Car.Builder addIsConsumableFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, Text.of(value));
    }

    @Override
    public Car.Builder addIsRelatedTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value);
    }

    @Override
    public Car.Builder addIsRelatedTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value.build());
    }

    @Override
    public Car.Builder addIsRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, Text.of(value));
    }

    @Override
    public Car.Builder addIsSimilarTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value);
    }

    @Override
    public Car.Builder addIsSimilarTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value.build());
    }

    @Override
    public Car.Builder addIsSimilarTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, Text.of(value));
    }

    @Override
    public Car.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public Car.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public Car.Builder addKnownVehicleDamages(Text value) {
      return addProperty(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES, value);
    }

    @Override
    public Car.Builder addKnownVehicleDamages(String value) {
      return addProperty(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES, Text.of(value));
    }

    @Override
    public Car.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Car.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Car.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Car.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Car.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Car.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Car.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Car.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Car.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public Car.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public Car.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public Car.Builder addMileageFromOdometer(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, value);
    }

    @Override
    public Car.Builder addMileageFromOdometer(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, value.build());
    }

    @Override
    public Car.Builder addMileageFromOdometer(String value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, Text.of(value));
    }

    @Override
    public Car.Builder addModel(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Car.Builder addModel(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value.build());
    }

    @Override
    public Car.Builder addModel(Text value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Car.Builder addModel(String value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, Text.of(value));
    }

    @Override
    public Car.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public Car.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public Car.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Car.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Car.Builder addNumberOfAirbags(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, value);
    }

    @Override
    public Car.Builder addNumberOfAirbags(Text value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, value);
    }

    @Override
    public Car.Builder addNumberOfAirbags(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, Text.of(value));
    }

    @Override
    public Car.Builder addNumberOfAxles(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value);
    }

    @Override
    public Car.Builder addNumberOfAxles(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value);
    }

    @Override
    public Car.Builder addNumberOfAxles(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value.build());
    }

    @Override
    public Car.Builder addNumberOfAxles(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, Text.of(value));
    }

    @Override
    public Car.Builder addNumberOfDoors(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value);
    }

    @Override
    public Car.Builder addNumberOfDoors(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value);
    }

    @Override
    public Car.Builder addNumberOfDoors(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value.build());
    }

    @Override
    public Car.Builder addNumberOfDoors(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, Text.of(value));
    }

    @Override
    public Car.Builder addNumberOfForwardGears(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value);
    }

    @Override
    public Car.Builder addNumberOfForwardGears(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value);
    }

    @Override
    public Car.Builder addNumberOfForwardGears(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value.build());
    }

    @Override
    public Car.Builder addNumberOfForwardGears(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, Text.of(value));
    }

    @Override
    public Car.Builder addNumberOfPreviousOwners(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value);
    }

    @Override
    public Car.Builder addNumberOfPreviousOwners(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value);
    }

    @Override
    public Car.Builder addNumberOfPreviousOwners(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value.build());
    }

    @Override
    public Car.Builder addNumberOfPreviousOwners(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, Text.of(value));
    }

    @Override
    public Car.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public Car.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public Car.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public Car.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Car.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Car.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Car.Builder addProductID(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, value);
    }

    @Override
    public Car.Builder addProductID(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, Text.of(value));
    }

    @Override
    public Car.Builder addProductionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, value);
    }

    @Override
    public Car.Builder addProductionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, Text.of(value));
    }

    @Override
    public Car.Builder addPurchaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, value);
    }

    @Override
    public Car.Builder addPurchaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, Text.of(value));
    }

    @Override
    public Car.Builder addReleaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, value);
    }

    @Override
    public Car.Builder addReleaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, Text.of(value));
    }

    @Override
    public Car.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Car.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Car.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Car.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Car.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Car.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Car.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Car.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Car.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public Car.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public Car.Builder addSteeringPosition(SteeringPositionValue value) {
      return addProperty(CoreConstants.PROPERTY_STEERING_POSITION, value);
    }

    @Override
    public Car.Builder addSteeringPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_STEERING_POSITION, Text.of(value));
    }

    @Override
    public Car.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Car.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleConfiguration(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION, value);
    }

    @Override
    public Car.Builder addVehicleConfiguration(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleEngine(EngineSpecification value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, value);
    }

    @Override
    public Car.Builder addVehicleEngine(EngineSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, value.build());
    }

    @Override
    public Car.Builder addVehicleEngine(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleIdentificationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER, value);
    }

    @Override
    public Car.Builder addVehicleIdentificationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleInteriorColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR, value);
    }

    @Override
    public Car.Builder addVehicleInteriorColor(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleInteriorType(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE, value);
    }

    @Override
    public Car.Builder addVehicleInteriorType(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleModelDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE, value);
    }

    @Override
    public Car.Builder addVehicleModelDate(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleSeatingCapacity(Number value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value);
    }

    @Override
    public Car.Builder addVehicleSeatingCapacity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value);
    }

    @Override
    public Car.Builder addVehicleSeatingCapacity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value.build());
    }

    @Override
    public Car.Builder addVehicleSeatingCapacity(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, Text.of(value));
    }

    @Override
    public Car.Builder addVehicleTransmission(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Car.Builder addVehicleTransmission(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Car.Builder addVehicleTransmission(URL value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Car.Builder addVehicleTransmission(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, Text.of(value));
    }

    @Override
    public Car.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public Car.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public Car.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public Car.Builder addWidth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Car.Builder addWidth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Car.Builder addWidth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Car.Builder addWidth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Car.Builder addWidth(String value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, Text.of(value));
    }

    @Override
    public Car.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Car.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Car.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Car.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Car.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Car.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Car build() {
      return new CarImpl(properties, reverseMap);
    }
  }

  public CarImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_CAR;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
