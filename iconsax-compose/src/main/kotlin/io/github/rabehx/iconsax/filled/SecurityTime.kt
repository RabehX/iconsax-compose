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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.SecurityTime: ImageVector
    get() {
        if (_SecurityTime != null) {
            return _SecurityTime!!
        }
        _SecurityTime = ImageVector.Builder(
            name = "Filled.SecurityTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.25f)
                curveTo(10.21f, 8.25f, 8.75f, 9.71f, 8.75f, 11.5f)
                curveTo(8.75f, 13.29f, 10.21f, 14.75f, 12f, 14.75f)
                curveTo(13.79f, 14.75f, 15.25f, 13.29f, 15.25f, 11.5f)
                curveTo(15.25f, 9.71f, 13.79f, 8.25f, 12f, 8.25f)
                close()
                moveTo(13f, 11.18f)
                curveTo(13f, 11.79f, 12.67f, 12.37f, 12.15f, 12.68f)
                lineTo(11.38f, 13.14f)
                curveTo(11.26f, 13.21f, 11.13f, 13.25f, 10.99f, 13.25f)
                curveTo(10.74f, 13.25f, 10.49f, 13.12f, 10.35f, 12.89f)
                curveTo(10.14f, 12.53f, 10.25f, 12.07f, 10.61f, 11.86f)
                lineTo(11.37f, 11.4f)
                curveTo(11.45f, 11.35f, 11.49f, 11.27f, 11.49f, 11.19f)
                verticalLineTo(10.26f)
                curveTo(11.49f, 9.85f, 11.83f, 9.51f, 12.24f, 9.51f)
                curveTo(12.65f, 9.51f, 13f, 9.84f, 13f, 10.25f)
                verticalLineTo(11.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.541f, 4.171f)
                lineTo(13.041f, 2.111f)
                curveTo(12.471f, 1.901f, 11.541f, 1.901f, 10.971f, 2.111f)
                lineTo(5.471f, 4.171f)
                curveTo(4.411f, 4.571f, 3.551f, 5.811f, 3.551f, 6.941f)
                verticalLineTo(15.041f)
                curveTo(3.551f, 15.851f, 4.081f, 16.921f, 4.731f, 17.401f)
                lineTo(10.231f, 21.511f)
                curveTo(11.201f, 22.241f, 12.791f, 22.241f, 13.761f, 21.511f)
                lineTo(19.261f, 17.401f)
                curveTo(19.911f, 16.911f, 20.441f, 15.851f, 20.441f, 15.041f)
                verticalLineTo(6.941f)
                curveTo(20.451f, 5.811f, 19.591f, 4.571f, 18.541f, 4.171f)
                close()
                moveTo(12.001f, 16.251f)
                curveTo(9.381f, 16.251f, 7.251f, 14.121f, 7.251f, 11.501f)
                curveTo(7.251f, 8.881f, 9.381f, 6.751f, 12.001f, 6.751f)
                curveTo(14.621f, 6.751f, 16.751f, 8.881f, 16.751f, 11.501f)
                curveTo(16.751f, 14.121f, 14.621f, 16.251f, 12.001f, 16.251f)
                close()
            }
        }.build()

        return _SecurityTime!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityTime: ImageVector? = null
