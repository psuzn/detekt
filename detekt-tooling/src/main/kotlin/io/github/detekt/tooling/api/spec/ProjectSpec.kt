package io.github.detekt.tooling.api.spec

import java.nio.file.Path

/**
 * Project specific configuration and paths.
 */
interface ProjectSpec {

    /**
     * A base path to relativize paths. Mostly used for generating path in the output or report.
     */
    val basePath: Path

    /**
     * Paths to analyze. Works with files and directories.
     */
    val inputPaths: Collection<Path>
}
