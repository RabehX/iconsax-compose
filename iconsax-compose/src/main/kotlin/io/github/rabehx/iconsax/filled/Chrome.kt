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


val Iconsax.Filled.Chrome: ImageVector
    get() {
        if (_Chrome != null) {
            return _Chrome!!
        }
        _Chrome = ImageVector.Builder(
            name = "Filled.Chrome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.819f, 6.9f)
                curveTo(14.679f, 6.28f, 17.58f, 6.19f, 20.449f, 6.66f)
                curveTo(18.68f, 3.86f, 15.559f, 2f, 12f, 2f)
                curveTo(8.89f, 2f, 6.11f, 3.42f, 4.27f, 5.65f)
                curveTo(4.71f, 6.95f, 5.27f, 8.19f, 5.94f, 9.37f)
                curveTo(6.32f, 10.05f, 7.29f, 10.02f, 7.68f, 9.35f)
                curveTo(8.53f, 7.92f, 10.059f, 6.96f, 11.819f, 6.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.72f, 14.721f)
                curveTo(5.72f, 12.581f, 4.16f, 10.141f, 3.09f, 7.441f)
                curveTo(1.59f, 10.401f, 1.6f, 14.031f, 3.43f, 17.081f)
                curveTo(5.03f, 19.751f, 7.67f, 21.411f, 10.53f, 21.841f)
                curveTo(11.42f, 20.791f, 12.2f, 19.671f, 12.87f, 18.501f)
                curveTo(13.26f, 17.821f, 12.73f, 17.011f, 11.95f, 17.011f)
                curveTo(10.28f, 17.021f, 8.67f, 16.201f, 7.72f, 14.721f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.57f, 11.998f)
                curveTo(8.57f, 12.608f, 8.72f, 13.178f, 9.03f, 13.718f)
                curveTo(9.64f, 14.768f, 10.77f, 15.428f, 11.99f, 15.428f)
                curveTo(13.21f, 15.428f, 14.35f, 14.768f, 14.95f, 13.718f)
                curveTo(15.26f, 13.178f, 15.42f, 12.608f, 15.42f, 11.998f)
                curveTo(15.42f, 10.108f, 13.88f, 8.578f, 11.99f, 8.578f)
                curveTo(10.11f, 8.568f, 8.57f, 10.108f, 8.57f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.34f, 8.419f)
                curveTo(19.97f, 8.129f, 18.58f, 7.969f, 17.2f, 7.949f)
                curveTo(16.41f, 7.939f, 15.96f, 8.799f, 16.35f, 9.489f)
                curveTo(16.75f, 10.199f, 16.98f, 11.019f, 16.98f, 11.889f)
                curveTo(16.98f, 12.729f, 16.76f, 13.559f, 16.35f, 14.299f)
                curveTo(15.41f, 17.179f, 14.01f, 19.739f, 12.16f, 21.999f)
                curveTo(17.61f, 21.909f, 22f, 17.469f, 22f, 11.999f)
                curveTo(22f, 10.739f, 21.77f, 9.529f, 21.34f, 8.419f)
                close()
            }
        }.build()

        return _Chrome!!
    }

@Suppress("ObjectPropertyName")
private var _Chrome: ImageVector? = null
