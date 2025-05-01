/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.automirrored.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.AutoMirrored.Outline.ArrowRight2: ImageVector
    get() {
        if (_ArrowRight2 != null) {
            return _ArrowRight2!!
        }
        _ArrowRight2 = ImageVector.Builder(
            name = "ArrowRight2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.91f, 20.67f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.07f, -0.53f, -0.22f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(6.52f, -6.52f)
                curveToRelative(0.48f, -0.48f, 0.48f, -1.26f, 0f, -1.74f)
                lineTo(8.38f, 4.61f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                lineToRelative(6.52f, 6.52f)
                curveToRelative(0.51f, 0.51f, 0.8f, 1.2f, 0.8f, 1.93f)
                reflectiveCurveToRelative(-0.28f, 1.42f, -0.8f, 1.93f)
                lineToRelative(-6.52f, 6.52f)
                curveToRelative(-0.15f, 0.14f, -0.34f, 0.22f, -0.53f, 0.22f)
                close()
            }
        }.build()

        return _ArrowRight2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight2: ImageVector? = null
