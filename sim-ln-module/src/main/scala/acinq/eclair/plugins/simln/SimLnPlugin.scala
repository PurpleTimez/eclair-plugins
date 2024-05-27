/*
 * Copyright 2024 Nui Atoll Open-Source Devs Crew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.acinq.eclair.plugins.simln

import akka.actor.ActorSystem
import fr.acinq.eclair.api.directives.EclairDirectives

class SimLnPlugin extends Plugin with RouteProvider with Logging {

  private var pluginKit: SimLnKit = _

  override def params: PluginParams = new PluginParams {
    override def name: String = "SimLnPlugin"
  }

  override def onSetup(setup: Setup): Unit = {

  }

  override def onKit(kit: Kit): Unit = {

  }

  override def route(eclairDirectives: EclairDirectives): Route = {
    // ApiHandler.registerRoutes(pluginKit, eclairDirectives)
  }
}

case class SimLnKit(nodeParams: NodeParams, system: ActorSystem)
