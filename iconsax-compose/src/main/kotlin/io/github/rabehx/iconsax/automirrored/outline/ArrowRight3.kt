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

val Iconsax.AutoMirrored.Outline.ArrowRight3: ImageVector
    get() {
        if (_ArrowRight3 != null) {
            return _ArrowRight3!!
        }
        _ArrowRight3 = ImageVector.Builder(
            name = "ArrowRight3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.9f, 19.15f)
                curveToRelative(-0.63f, 0f, -1.22f, -0.15f, -1.74f, -0.45f)
                curveToRelative(-1.23f, -0.71f, -1.91f, -2.14f, -1.91f, -4.02f)
                lineTo(5.25f, 9.33f)
                curveToRelative(0f, -1.88f, 0.68f, -3.31f, 1.91f, -4.02f)
                curveToRelative(1.23f, -0.71f, 2.8f, -0.58f, 4.44f, 0.36f)
                lineToRelative(4.63f, 2.67f)
                curveToRelative(1.63f, 0.94f, 2.53f, 2.24f, 2.53f, 3.66f)
                reflectiveCurveToRelative(-0.9f, 2.72f, -2.53f, 3.66f)
                lineToRelative(-4.63f, 2.67f)
                curveToRelative(-0.94f, 0.55f, -1.86f, 0.82f, -2.7f, 0.82f)
                close()
                moveTo(8.9f, 6.36f)
                curveToRelative(-0.37f, 0f, -0.71f, 0.08f, -1f, 0.25f)
                curveToRelative(-0.74f, 0.43f, -1.15f, 1.39f, -1.15f, 2.72f)
                verticalLineToRelative(5.34f)
                curveToRelative(0f, 1.32f, 0.41f, 2.29f, 1.16f, 2.72f)
                curveToRelative(0.75f, 0.43f, 1.79f, 0.3f, 2.94f, -0.36f)
                lineToRelative(4.63f, -2.67f)
                curveToRelative(1.15f, -0.66f, 1.78f, -1.5f, 1.78f, -2.36f)
                curveToRelative(0f, -0.86f, -0.63f, -1.7f, -1.78f, -2.36f)
                lineToRelative(-4.63f, -2.67f)
                curveToRelative(-0.71f, -0.41f, -1.37f, -0.61f, -1.95f, -0.61f)
                close()
            }
        }.build()

        return _ArrowRight3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight3: ImageVector? = null
