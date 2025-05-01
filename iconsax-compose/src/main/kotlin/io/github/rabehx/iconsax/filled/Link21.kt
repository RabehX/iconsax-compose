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


val Iconsax.Filled.Link21: ImageVector
    get() {
        if (_Link21 != null) {
            return _Link21!!
        }
        _Link21 = ImageVector.Builder(
            name = "Filled.Link21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.071f, 14.242f)
                curveTo(18.781f, 14.532f, 18.321f, 14.532f, 18.041f, 14.242f)
                curveTo(17.751f, 13.952f, 17.751f, 13.492f, 18.041f, 13.212f)
                curveTo(20.041f, 11.212f, 20.041f, 7.962f, 18.041f, 5.972f)
                curveTo(16.041f, 3.982f, 12.791f, 3.972f, 10.801f, 5.972f)
                curveTo(8.811f, 7.972f, 8.801f, 11.222f, 10.801f, 13.212f)
                curveTo(11.091f, 13.502f, 11.091f, 13.962f, 10.801f, 14.242f)
                curveTo(10.511f, 14.532f, 10.051f, 14.532f, 9.771f, 14.242f)
                curveTo(7.201f, 11.672f, 7.201f, 7.492f, 9.771f, 4.932f)
                curveTo(12.341f, 2.372f, 16.521f, 2.362f, 19.081f, 4.932f)
                curveTo(21.641f, 7.502f, 21.641f, 11.672f, 19.071f, 14.242f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.929f, 9.76f)
                curveTo(5.219f, 9.47f, 5.679f, 9.47f, 5.959f, 9.76f)
                curveTo(6.249f, 10.05f, 6.249f, 10.51f, 5.959f, 10.79f)
                curveTo(3.959f, 12.79f, 3.959f, 16.041f, 5.959f, 18.031f)
                curveTo(7.959f, 20.021f, 11.209f, 20.031f, 13.199f, 18.031f)
                curveTo(15.189f, 16.031f, 15.199f, 12.781f, 13.199f, 10.79f)
                curveTo(12.909f, 10.5f, 12.909f, 10.04f, 13.199f, 9.76f)
                curveTo(13.489f, 9.47f, 13.949f, 9.47f, 14.229f, 9.76f)
                curveTo(16.799f, 12.33f, 16.799f, 16.51f, 14.229f, 19.07f)
                curveTo(11.659f, 21.631f, 7.479f, 21.64f, 4.919f, 19.07f)
                curveTo(2.359f, 16.5f, 2.359f, 12.33f, 4.929f, 9.76f)
                close()
            }
        }.build()

        return _Link21!!
    }

@Suppress("ObjectPropertyName")
private var _Link21: ImageVector? = null
