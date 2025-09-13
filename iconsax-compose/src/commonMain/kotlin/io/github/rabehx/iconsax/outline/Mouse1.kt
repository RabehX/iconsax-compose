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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Mouse1: ImageVector
    get() {
        if (_Mouse1 != null) {
            return _Mouse1!!
        }
        _Mouse1 = ImageVector.Builder(
            name = "Outline.Mouse1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.311f, 18f)
                curveTo(11.301f, 18f, 11.301f, 18f, 11.291f, 18f)
                curveTo(10.251f, 17.99f, 9.371f, 17.34f, 9.061f, 16.35f)
                lineTo(7.111f, 10.07f)
                curveTo(6.851f, 9.22f, 7.071f, 8.31f, 7.701f, 7.69f)
                curveTo(8.321f, 7.07f, 9.221f, 6.85f, 10.061f, 7.11f)
                lineTo(16.351f, 9.06f)
                curveTo(17.351f, 9.37f, 18.001f, 10.25f, 18.011f, 11.29f)
                curveTo(18.021f, 12.33f, 17.391f, 13.21f, 16.401f, 13.54f)
                lineTo(14.681f, 14.12f)
                curveTo(14.421f, 14.21f, 14.231f, 14.4f, 14.141f, 14.65f)
                lineTo(13.551f, 16.38f)
                curveTo(13.221f, 17.37f, 12.341f, 18f, 11.311f, 18f)
                close()
                moveTo(9.341f, 8.5f)
                curveTo(9.041f, 8.5f, 8.841f, 8.66f, 8.751f, 8.75f)
                curveTo(8.521f, 8.98f, 8.441f, 9.31f, 8.541f, 9.62f)
                lineTo(10.491f, 15.9f)
                curveTo(10.661f, 16.45f, 11.151f, 16.5f, 11.301f, 16.5f)
                curveTo(11.421f, 16.49f, 11.931f, 16.46f, 12.111f, 15.91f)
                lineTo(12.701f, 14.18f)
                curveTo(12.931f, 13.49f, 13.491f, 12.93f, 14.181f, 12.7f)
                lineTo(15.901f, 12.12f)
                curveTo(15.901f, 12.12f, 15.901f, 12.12f, 15.911f, 12.12f)
                curveTo(16.461f, 11.94f, 16.501f, 11.45f, 16.501f, 11.31f)
                curveTo(16.501f, 11.16f, 16.451f, 10.67f, 15.901f, 10.5f)
                lineTo(9.611f, 8.55f)
                curveTo(9.511f, 8.51f, 9.421f, 8.5f, 9.341f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _Mouse1!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse1: ImageVector? = null
