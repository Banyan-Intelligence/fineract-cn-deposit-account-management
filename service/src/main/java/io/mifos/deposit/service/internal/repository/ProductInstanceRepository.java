/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.deposit.service.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductInstanceRepository extends JpaRepository<ProductInstanceEntity, Long> {

  List<ProductInstanceEntity> findByCustomerIdentifier(final String customerIdentifier);

  List<ProductInstanceEntity> findByProductDefinition(final ProductDefinitionEntity productDefinitionEntity);

  List<ProductInstanceEntity> findByProductDefinitionAndCustomerIdentifier(
      final ProductDefinitionEntity productDefinitionEntity, final String customerIdentifier);

  Optional<ProductInstanceEntity> findByAccountIdentifier(final String identifier);
}
