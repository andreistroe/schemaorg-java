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

package com.google.schemaorg.core.impl;import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.Action;
import com.google.schemaorg.core.AdministrativeArea;
import com.google.schemaorg.core.Article;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CreativeWork;
import com.google.schemaorg.core.ImageObject;
import com.google.schemaorg.core.MedicalCondition;
import com.google.schemaorg.core.PeopleAudience;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link PeopleAudience}. */
public class PeopleAudienceImpl extends AudienceImpl implements PeopleAudience {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AUDIENCE_TYPE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_GEOGRAPHIC_AREA);

    builder.add(CoreConstants.PROPERTY_HEALTH_CONDITION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_REQUIRED_GENDER);

    builder.add(CoreConstants.PROPERTY_REQUIRED_MAX_AGE);

    builder.add(CoreConstants.PROPERTY_REQUIRED_MIN_AGE);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SUGGESTED_GENDER);

    builder.add(CoreConstants.PROPERTY_SUGGESTED_MAX_AGE);

    builder.add(CoreConstants.PROPERTY_SUGGESTED_MIN_AGE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  public static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<PeopleAudience.Builder>
      implements PeopleAudience.Builder {

    @Override
    public PeopleAudience.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public PeopleAudience.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public PeopleAudience.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addAudienceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE_TYPE, value);
    }

    @Override
    public PeopleAudience.Builder addAudienceType(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE_TYPE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public PeopleAudience.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addGeographicArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_GEOGRAPHIC_AREA, value);
    }

    @Override
    public PeopleAudience.Builder addGeographicArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEOGRAPHIC_AREA, value.build());
    }

    @Override
    public PeopleAudience.Builder addGeographicArea(String value) {
      return addProperty(CoreConstants.PROPERTY_GEOGRAPHIC_AREA, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addHealthCondition(MedicalCondition value) {
      return addProperty(CoreConstants.PROPERTY_HEALTH_CONDITION, value);
    }

    @Override
    public PeopleAudience.Builder addHealthCondition(MedicalCondition.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEALTH_CONDITION, value.build());
    }

    @Override
    public PeopleAudience.Builder addHealthCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_HEALTH_CONDITION, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PeopleAudience.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public PeopleAudience.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PeopleAudience.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PeopleAudience.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public PeopleAudience.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PeopleAudience.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public PeopleAudience.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public PeopleAudience.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public PeopleAudience.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addRequiredGender(Text value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_GENDER, value);
    }

    @Override
    public PeopleAudience.Builder addRequiredGender(String value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_GENDER, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addRequiredMaxAge(Integer value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_MAX_AGE, value);
    }

    @Override
    public PeopleAudience.Builder addRequiredMaxAge(String value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_MAX_AGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addRequiredMinAge(Integer value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_MIN_AGE, value);
    }

    @Override
    public PeopleAudience.Builder addRequiredMinAge(String value) {
      return addProperty(CoreConstants.PROPERTY_REQUIRED_MIN_AGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public PeopleAudience.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addSuggestedGender(Text value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_GENDER, value);
    }

    @Override
    public PeopleAudience.Builder addSuggestedGender(String value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_GENDER, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addSuggestedMaxAge(Number value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_MAX_AGE, value);
    }

    @Override
    public PeopleAudience.Builder addSuggestedMaxAge(String value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_MAX_AGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addSuggestedMinAge(Number value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_MIN_AGE, value);
    }

    @Override
    public PeopleAudience.Builder addSuggestedMinAge(String value) {
      return addProperty(CoreConstants.PROPERTY_SUGGESTED_MIN_AGE, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public PeopleAudience.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public PeopleAudience.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public PeopleAudience.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public PeopleAudience.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public PeopleAudience.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public PeopleAudience.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public PeopleAudience build() {
      return new PeopleAudienceImpl(properties, reverseMap);
    }
  }

  public PeopleAudienceImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PEOPLE_AUDIENCE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHealthConditionList() {
    return getProperty(CoreConstants.PROPERTY_HEALTH_CONDITION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredGenderList() {
    return getProperty(CoreConstants.PROPERTY_REQUIRED_GENDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredMaxAgeList() {
    return getProperty(CoreConstants.PROPERTY_REQUIRED_MAX_AGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredMinAgeList() {
    return getProperty(CoreConstants.PROPERTY_REQUIRED_MIN_AGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedGenderList() {
    return getProperty(CoreConstants.PROPERTY_SUGGESTED_GENDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedMaxAgeList() {
    return getProperty(CoreConstants.PROPERTY_SUGGESTED_MAX_AGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedMinAgeList() {
    return getProperty(CoreConstants.PROPERTY_SUGGESTED_MIN_AGE);
  }
}
