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


val Iconsax.Filled.Path: ImageVector
    get() {
        if (_Path != null) {
            return _Path!!
        }
        _Path = ImageVector.Builder(
            name = "Filled.Path",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.02f, 10.7f)
                lineTo(17.9f, 12.04f)
                curveTo(17.5f, 12.29f, 16.99f, 12.23f, 16.66f, 11.9f)
                lineTo(12.13f, 7.37f)
                curveTo(11.8f, 7.04f, 11.74f, 6.53f, 11.99f, 6.13f)
                lineTo(13.33f, 4.01f)
                curveTo(14.15f, 2.72f, 15.79f, 2.66f, 17f, 3.86f)
                lineTo(20.18f, 7.04f)
                curveTo(21.3f, 8.17f, 21.23f, 9.93f, 20.02f, 10.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.711f, 19.95f)
                lineTo(5.991f, 20.97f)
                curveTo(5.913f, 20.98f, 5.836f, 20.987f, 5.761f, 20.992f)
                curveTo(5.076f, 21.032f, 4.906f, 20.225f, 5.391f, 19.739f)
                lineTo(7.981f, 17.15f)
                curveTo(8.301f, 16.84f, 8.301f, 16.35f, 7.981f, 16.04f)
                curveTo(7.681f, 15.73f, 7.191f, 15.73f, 6.871f, 16.04f)
                lineTo(4.281f, 18.629f)
                curveTo(3.796f, 19.115f, 2.996f, 18.944f, 3.032f, 18.259f)
                curveTo(3.036f, 18.187f, 3.042f, 18.114f, 3.051f, 18.04f)
                lineTo(4.081f, 9.32f)
                curveTo(4.341f, 7.14f, 5.141f, 6.42f, 7.441f, 6.56f)
                lineTo(8.941f, 6.65f)
                curveTo(9.431f, 6.68f, 9.891f, 6.89f, 10.241f, 7.24f)
                lineTo(16.791f, 13.79f)
                curveTo(17.141f, 14.14f, 17.351f, 14.6f, 17.371f, 15.09f)
                lineTo(17.461f, 16.59f)
                curveTo(17.691f, 18.9f, 16.901f, 19.7f, 14.711f, 19.95f)
                close()
            }
        }.build()

        return _Path!!
    }

@Suppress("ObjectPropertyName")
private var _Path: ImageVector? = null
