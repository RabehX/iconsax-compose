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

val Iconsax.AutoMirrored.Outline.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) {
            return _ArrowRight!!
        }
        _ArrowRight = ImageVector.Builder(
            name = "ArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.43f, 18.82f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.07f, -0.53f, -0.22f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineTo(19.44f, 12f)
                lineTo(13.9f, 6.46f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                lineToRelative(6.07f, 6.07f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(-6.07f, 6.07f)
                curveToRelative(-0.15f, 0.15f, -0.34f, 0.22f, -0.53f, 0.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.33f, 12.75f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.83f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                close()
            }
        }.build()

        return _ArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight: ImageVector? = null
