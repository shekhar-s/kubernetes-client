/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.openshift.client.dsl;

import io.fabric8.kubernetes.client.dsl.ClientResource;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.DeploymentConfigList;
import io.fabric8.openshift.api.model.DoneableDeploymentConfig;
import io.fabric8.openshift.client.OpenShiftClient;

public class DeploymentConfigOperationsImpl extends OpenshiftOperation<OpenShiftClient, DeploymentConfig, DeploymentConfigList, DoneableDeploymentConfig,
  ClientResource<DeploymentConfig, DoneableDeploymentConfig>> {

  public DeploymentConfigOperationsImpl(OpenShiftClient client) {
    super(client, "deploymentconfigs", null, null);
  }

  public DeploymentConfigOperationsImpl(OpenShiftClient client, String namespace, String name) {
    super(client, "deploymentconfigs", namespace, name);
  }
}