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

val Iconsax.AutoMirrored.Outline.ArrowLeft3: ImageVector
    get() {
        if (_ArrowLeft3 != null) {
            return _ArrowLeft3!!
        }
        _ArrowLeft3 = ImageVector.Builder(
            name = "ArrowLeft3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.1f, 19.15f)
                curveToRelative(-0.84f, 0f, -1.76f, -0.27f, -2.69f, -0.81f)
                lineToRelative(-4.63f, -2.67f)
                curveToRelative(-1.63f, -0.95f, -2.53f, -2.25f, -2.53f, -3.67f)
                reflectiveCurveToRelative(0.9f, -2.72f, 2.53f, -3.66f)
                lineToRelative(4.63f, -2.67f)
                curveToRelative(1.63f, -0.94f, 3.2f, -1.07f, 4.44f, -0.36f)
                curveToRelative(1.23f, 0.71f, 1.91f, 2.14f, 1.91f, 4.02f)
                verticalLineToRelative(5.34f)
                curveToRelative(0f, 1.88f, -0.68f, 3.31f, -1.91f, 4.02f)
                curveToRelative(-0.53f, 0.31f, -1.12f, 0.46f, -1.75f, 0.46f)
                close()
                moveTo(15.1f, 6.36f)
                curveToRelative(-0.58f, 0f, -1.24f, 0.2f, -1.94f, 0.61f)
                lineTo(8.53f, 9.64f)
                curveToRelative(-1.15f, 0.66f, -1.78f, 1.5f, -1.78f, 2.36f)
                curveToRelative(0f, 0.86f, 0.63f, 1.7f, 1.78f, 2.36f)
                lineToRelative(4.63f, 2.67f)
                curveToRelative(1.15f, 0.66f, 2.19f, 0.79f, 2.94f, 0.36f)
                curveToRelative(0.75f, -0.43f, 1.16f, -1.4f, 1.16f, -2.72f)
                lineTo(17.26f, 9.33f)
                curveToRelative(0f, -1.32f, -0.41f, -2.29f, -1.16f, -2.72f)
                curveToRelative(-0.3f, -0.17f, -0.64f, -0.25f, -1f, -0.25f)
                close()
            }
        }.build()

        return _ArrowLeft3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft3: ImageVector? = null
