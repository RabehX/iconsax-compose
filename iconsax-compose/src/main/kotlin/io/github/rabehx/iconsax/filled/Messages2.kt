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


val Iconsax.Filled.Messages2: ImageVector
    get() {
        if (_Messages2 != null) {
            return _Messages2!!
        }
        _Messages2 = ImageVector.Builder(
            name = "Filled.Messages2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.47f, 16.83f)
                lineTo(18.86f, 19.99f)
                curveTo(18.96f, 20.82f, 18.07f, 21.4f, 17.36f, 20.97f)
                lineTo(13.9f, 18.91f)
                curveTo(13.66f, 18.77f, 13.6f, 18.47f, 13.73f, 18.23f)
                curveTo(14.23f, 17.31f, 14.5f, 16.27f, 14.5f, 15.23f)
                curveTo(14.5f, 11.57f, 11.36f, 8.59f, 7.5f, 8.59f)
                curveTo(6.71f, 8.59f, 5.94f, 8.71f, 5.22f, 8.95f)
                curveTo(4.85f, 9.07f, 4.49f, 8.73f, 4.58f, 8.35f)
                curveTo(5.49f, 4.71f, 8.99f, 2f, 13.17f, 2f)
                curveTo(18.05f, 2f, 22f, 5.69f, 22f, 10.24f)
                curveTo(22f, 12.94f, 20.61f, 15.33f, 18.47f, 16.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 15.23f)
                curveTo(13f, 16.42f, 12.56f, 17.52f, 11.82f, 18.39f)
                curveTo(10.83f, 19.59f, 9.26f, 20.36f, 7.5f, 20.36f)
                lineTo(4.89f, 21.91f)
                curveTo(4.45f, 22.18f, 3.89f, 21.81f, 3.95f, 21.3f)
                lineTo(4.2f, 19.33f)
                curveTo(2.86f, 18.4f, 2f, 16.91f, 2f, 15.23f)
                curveTo(2f, 13.47f, 2.94f, 11.92f, 4.38f, 11f)
                curveTo(5.27f, 10.42f, 6.34f, 10.09f, 7.5f, 10.09f)
                curveTo(10.54f, 10.09f, 13f, 12.39f, 13f, 15.23f)
                close()
            }
        }.build()

        return _Messages2!!
    }

@Suppress("ObjectPropertyName")
private var _Messages2: ImageVector? = null
