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

val Iconsax.Outline.Level: ImageVector
    get() {
        if (_Level != null) {
            return _Level!!
        }
        _Level = ImageVector.Builder(
            name = "Outline.Level",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.92f, 22.75f, 2.49f, 19.14f, 1.47f, 14.17f)
                curveTo(1.39f, 13.76f, 1.65f, 13.37f, 2.05f, 13.28f)
                curveTo(2.46f, 13.2f, 2.85f, 13.46f, 2.94f, 13.86f)
                curveTo(3.82f, 18.14f, 7.63f, 21.25f, 12f, 21.25f)
                curveTo(16.36f, 21.25f, 20.17f, 18.16f, 21.059f, 13.9f)
                curveTo(21.139f, 13.49f, 21.539f, 13.23f, 21.949f, 13.32f)
                curveTo(22.36f, 13.4f, 22.619f, 13.8f, 22.529f, 14.21f)
                curveTo(21.49f, 19.15f, 17.069f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.811f, 10.81f)
                curveTo(21.461f, 10.81f, 21.151f, 10.56f, 21.081f, 10.2f)
                curveTo(20.231f, 5.88f, 16.411f, 2.74f, 12.001f, 2.74f)
                curveTo(7.621f, 2.74f, 3.811f, 5.85f, 2.941f, 10.13f)
                curveTo(2.861f, 10.54f, 2.461f, 10.79f, 2.051f, 10.71f)
                curveTo(1.641f, 10.63f, 1.381f, 10.23f, 1.471f, 9.82f)
                curveTo(2.491f, 4.85f, 6.921f, 1.24f, 12.001f, 1.24f)
                curveTo(17.131f, 1.24f, 21.561f, 4.89f, 22.551f, 9.91f)
                curveTo(22.631f, 10.32f, 22.361f, 10.71f, 21.961f, 10.79f)
                curveTo(21.911f, 10.81f, 21.861f, 10.81f, 21.811f, 10.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.25f)
                curveTo(10.76f, 14.25f, 9.75f, 13.24f, 9.75f, 12f)
                curveTo(9.75f, 10.76f, 10.76f, 9.75f, 12f, 9.75f)
                curveTo(13.24f, 9.75f, 14.25f, 10.76f, 14.25f, 12f)
                curveTo(14.25f, 13.24f, 13.24f, 14.25f, 12f, 14.25f)
                close()
                moveTo(12f, 11.25f)
                curveTo(11.59f, 11.25f, 11.25f, 11.59f, 11.25f, 12f)
                curveTo(11.25f, 12.41f, 11.59f, 12.75f, 12f, 12.75f)
                curveTo(12.41f, 12.75f, 12.75f, 12.41f, 12.75f, 12f)
                curveTo(12.75f, 11.59f, 12.41f, 11.25f, 12f, 11.25f)
                close()
            }
        }.build()

        return _Level!!
    }

@Suppress("ObjectPropertyName")
private var _Level: ImageVector? = null
