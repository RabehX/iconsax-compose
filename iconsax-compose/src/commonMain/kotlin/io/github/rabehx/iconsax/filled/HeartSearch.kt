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


val Iconsax.Filled.HeartSearch: ImageVector
    get() {
        if (_HeartSearch != null) {
            return _HeartSearch!!
        }
        _HeartSearch = ImageVector.Builder(
            name = "Filled.HeartSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.74f, 20.508f)
                lineTo(20.88f, 19.648f)
                curveTo(21.33f, 18.968f, 21.59f, 18.158f, 21.59f, 17.288f)
                curveTo(21.59f, 14.918f, 19.67f, 12.988f, 17.29f, 12.988f)
                curveTo(14.91f, 12.988f, 13f, 14.918f, 13f, 17.298f)
                curveTo(13f, 19.678f, 14.92f, 21.598f, 17.3f, 21.598f)
                curveTo(18.17f, 21.598f, 18.98f, 21.338f, 19.66f, 20.888f)
                lineTo(20.52f, 21.748f)
                curveTo(20.69f, 21.918f, 20.91f, 22.008f, 21.14f, 22.008f)
                curveTo(21.37f, 22.008f, 21.59f, 21.918f, 21.76f, 21.748f)
                curveTo(22.09f, 21.398f, 22.09f, 20.848f, 21.74f, 20.508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.731f)
                curveTo(22f, 9.921f, 21.81f, 11.021f, 21.48f, 12.041f)
                curveTo(21.42f, 12.251f, 21.17f, 12.311f, 20.99f, 12.181f)
                curveTo(19.9f, 11.371f, 18.57f, 10.941f, 17.2f, 10.941f)
                curveTo(13.73f, 10.941f, 10.9f, 13.771f, 10.9f, 17.241f)
                curveTo(10.9f, 18.321f, 11.18f, 19.381f, 11.71f, 20.321f)
                curveTo(11.87f, 20.601f, 11.68f, 20.961f, 11.38f, 20.851f)
                curveTo(8.97f, 20.031f, 4.1f, 17.041f, 2.52f, 12.041f)
                curveTo(2.19f, 11.021f, 2f, 9.921f, 2f, 8.731f)
                curveTo(2f, 5.641f, 4.49f, 3.141f, 7.56f, 3.141f)
                curveTo(9.37f, 3.141f, 10.99f, 4.021f, 12f, 5.371f)
                curveTo(13.01f, 4.021f, 14.63f, 3.141f, 16.44f, 3.141f)
                curveTo(19.51f, 3.141f, 22f, 5.641f, 22f, 8.731f)
                close()
            }
        }.build()

        return _HeartSearch!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSearch: ImageVector? = null
