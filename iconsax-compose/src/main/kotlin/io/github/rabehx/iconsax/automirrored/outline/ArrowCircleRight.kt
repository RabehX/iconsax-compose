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

val Iconsax.AutoMirrored.Outline.ArrowCircleRight: ImageVector
    get() {
        if (_ArrowCircleRight != null) {
            return _ArrowCircleRight!!
        }
        _ArrowCircleRight = ImageVector.Builder(
            name = "ArrowCircleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                reflectiveCurveTo(6.07f, 1.25f, 12f, 1.25f)
                reflectiveCurveTo(22.75f, 6.07f, 22.75f, 12f)
                reflectiveCurveTo(17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                reflectiveCurveTo(6.9f, 21.25f, 12f, 21.25f)
                reflectiveCurveToRelative(9.25f, -4.15f, 9.25f, -9.25f)
                reflectiveCurveTo(17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.74f, 16.28f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.07f, -0.53f, -0.22f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                lineToRelative(3.53f, 3.53f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(-3.53f, 3.53f)
                curveToRelative(-0.15f, 0.15f, -0.34f, 0.22f, -0.53f, 0.22f)
                close()
            }
        }.build()

        return _ArrowCircleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleRight: ImageVector? = null
