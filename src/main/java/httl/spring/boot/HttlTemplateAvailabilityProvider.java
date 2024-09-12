/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package httl.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.template.PathBasedTemplateAvailabilityProvider;

public class HttlTemplateAvailabilityProvider extends PathBasedTemplateAvailabilityProvider {

	public HttlTemplateAvailabilityProvider() {
		super("org.httl.core.Configuration", HttlTemplateAvailabilityProperties.class, "spring.httl");
	}

	static final class HttlTemplateAvailabilityProperties extends TemplateAvailabilityProperties {

		private List<String> templateLoaderPath = new ArrayList<String>(Arrays.asList(HttlProperties.DEFAULT_TEMPLATE_LOADER_PATH));

		HttlTemplateAvailabilityProperties() {
			super(HttlProperties.DEFAULT_PREFIX, HttlProperties.DEFAULT_SUFFIX);
		}

		@Override
		protected List<String> getLoaderPath() {
			return this.templateLoaderPath;
		}

		public List<String> getTemplateLoaderPath() {
			return this.templateLoaderPath;
		}

		public void setTemplateLoaderPath(List<String> templateLoaderPath) {
			this.templateLoaderPath = templateLoaderPath;
		}

	}

}
