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


val Iconsax.Filled.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Filled.Key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.789f, 4.22f)
                curveTo(16.829f, 1.27f, 12.029f, 1.27f, 9.089f, 4.22f)
                curveTo(7.019f, 6.27f, 6.399f, 9.22f, 7.199f, 11.82f)
                lineTo(2.499f, 16.52f)
                curveTo(2.169f, 16.86f, 1.939f, 17.53f, 2.009f, 18.01f)
                lineTo(2.309f, 20.19f)
                curveTo(2.419f, 20.91f, 3.089f, 21.59f, 3.809f, 21.69f)
                lineTo(5.989f, 21.99f)
                curveTo(6.469f, 22.06f, 7.139f, 21.84f, 7.479f, 21.49f)
                lineTo(8.299f, 20.67f)
                curveTo(8.499f, 20.48f, 8.499f, 20.16f, 8.299f, 19.96f)
                lineTo(6.359f, 18.02f)
                curveTo(6.069f, 17.73f, 6.069f, 17.25f, 6.359f, 16.96f)
                curveTo(6.649f, 16.67f, 7.129f, 16.67f, 7.419f, 16.96f)
                lineTo(9.369f, 18.91f)
                curveTo(9.559f, 19.1f, 9.879f, 19.1f, 10.069f, 18.91f)
                lineTo(12.189f, 16.8f)
                curveTo(14.779f, 17.61f, 17.729f, 16.98f, 19.789f, 14.93f)
                curveTo(22.739f, 11.98f, 22.739f, 7.17f, 19.789f, 4.22f)
                close()
                moveTo(14.499f, 12f)
                curveTo(13.119f, 12f, 11.999f, 10.88f, 11.999f, 9.5f)
                curveTo(11.999f, 8.12f, 13.119f, 7f, 14.499f, 7f)
                curveTo(15.879f, 7f, 16.999f, 8.12f, 16.999f, 9.5f)
                curveTo(16.999f, 10.88f, 15.879f, 12f, 14.499f, 12f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
