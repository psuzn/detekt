package io.gitlab.arturbosch.detekt.formatting.wrappers

import com.pinterest.ktlint.ruleset.standard.rules.EnumEntryNameCaseRule
import io.gitlab.arturbosch.detekt.api.ActiveByDefault
import io.gitlab.arturbosch.detekt.api.Alias
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.internal.AutoCorrectable
import io.gitlab.arturbosch.detekt.formatting.FormattingRule

/**
 * See [ktlint docs](https://pinterest.github.io/ktlint/<ktlintVersion/>/rules/standard/#enum-entry) for documentation.
 */
@AutoCorrectable(since = "1.4.0")
@ActiveByDefault(since = "1.22.0")
@Alias("EnumEntryName")
class EnumEntryNameCase(config: Config) : FormattingRule(
    config,
    "Reports enum entries with names that don't meet standard conventions."
) {

    override val wrapping = EnumEntryNameCaseRule()
}
