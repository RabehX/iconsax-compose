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

val Iconsax.Outline.Bubble: ImageVector
    get() {
        if (_Bubble != null) {
            return _Bubble!!
        }
        _Bubble = ImageVector.Builder(
            name = "Outline.Bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.591f, 13.01f)
                curveTo(12.351f, 13.01f, 9.711f, 10.37f, 9.711f, 7.13f)
                curveTo(9.711f, 3.89f, 12.351f, 1.25f, 15.591f, 1.25f)
                curveTo(18.831f, 1.25f, 21.471f, 3.89f, 21.471f, 7.13f)
                curveTo(21.471f, 10.37f, 18.831f, 13.01f, 15.591f, 13.01f)
                close()
                moveTo(15.591f, 2.75f)
                curveTo(13.181f, 2.75f, 11.211f, 4.71f, 11.211f, 7.13f)
                curveTo(11.211f, 9.55f, 13.171f, 11.51f, 15.591f, 11.51f)
                curveTo(18.011f, 11.51f, 19.971f, 9.55f, 19.971f, 7.13f)
                curveTo(19.971f, 4.71f, 18.001f, 2.75f, 15.591f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.361f, 20.19f)
                curveTo(4.251f, 20.19f, 2.531f, 18.47f, 2.531f, 16.36f)
                curveTo(2.531f, 14.25f, 4.251f, 12.53f, 6.361f, 12.53f)
                curveTo(8.471f, 12.53f, 10.191f, 14.25f, 10.191f, 16.36f)
                curveTo(10.191f, 18.47f, 8.471f, 20.19f, 6.361f, 20.19f)
                close()
                moveTo(6.361f, 14.03f)
                curveTo(5.081f, 14.03f, 4.031f, 15.07f, 4.031f, 16.36f)
                curveTo(4.031f, 17.64f, 5.071f, 18.69f, 6.361f, 18.69f)
                curveTo(7.641f, 18.69f, 8.691f, 17.65f, 8.691f, 16.36f)
                curveTo(8.691f, 15.08f, 7.641f, 14.03f, 6.361f, 14.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.621f, 22.75f)
                curveTo(14.79f, 22.75f, 13.311f, 21.26f, 13.311f, 19.44f)
                curveTo(13.311f, 17.61f, 14.8f, 16.13f, 16.621f, 16.13f)
                curveTo(18.441f, 16.13f, 19.931f, 17.62f, 19.931f, 19.44f)
                curveTo(19.931f, 21.26f, 18.441f, 22.75f, 16.621f, 22.75f)
                close()
                moveTo(16.621f, 17.62f)
                curveTo(15.62f, 17.62f, 14.811f, 18.43f, 14.811f, 19.43f)
                curveTo(14.811f, 20.43f, 15.62f, 21.24f, 16.621f, 21.24f)
                curveTo(17.621f, 21.24f, 18.431f, 20.43f, 18.431f, 19.43f)
                curveTo(18.431f, 18.44f, 17.621f, 17.62f, 16.621f, 17.62f)
                close()
            }
        }.build()

        return _Bubble!!
    }

@Suppress("ObjectPropertyName")
private var _Bubble: ImageVector? = null
