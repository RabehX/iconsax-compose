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


val Iconsax.Filled.Happyemoji: ImageVector
    get() {
        if (_Happyemoji != null) {
            return _Happyemoji!!
        }
        _Happyemoji = ImageVector.Builder(
            name = "Filled.Happyemoji",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 2f)
                curveTo(6.451f, 2f, 1.971f, 6.48f, 1.971f, 12f)
                curveTo(1.971f, 17.52f, 6.451f, 22f, 11.971f, 22f)
                curveTo(17.491f, 22f, 21.971f, 17.52f, 21.971f, 12f)
                curveTo(21.971f, 6.48f, 17.501f, 2f, 11.971f, 2f)
                close()
                moveTo(17.401f, 16.43f)
                curveTo(16.171f, 18.2f, 14.151f, 19.25f, 12.001f, 19.25f)
                curveTo(9.851f, 19.25f, 7.831f, 18.2f, 6.601f, 16.43f)
                curveTo(6.361f, 16.09f, 6.451f, 15.62f, 6.791f, 15.39f)
                curveTo(7.131f, 15.15f, 7.601f, 15.24f, 7.831f, 15.58f)
                curveTo(8.781f, 16.94f, 10.341f, 17.76f, 12.001f, 17.76f)
                curveTo(13.661f, 17.76f, 15.221f, 16.95f, 16.171f, 15.58f)
                curveTo(16.411f, 15.24f, 16.871f, 15.16f, 17.211f, 15.39f)
                curveTo(17.561f, 15.62f, 17.641f, 16.09f, 17.401f, 16.43f)
                close()
            }
        }.build()

        return _Happyemoji!!
    }

@Suppress("ObjectPropertyName")
private var _Happyemoji: ImageVector? = null
