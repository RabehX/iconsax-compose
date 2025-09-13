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


val Iconsax.Filled.Save2: ImageVector
    get() {
        if (_Save2 != null) {
            return _Save2!!
        }
        _Save2 = ImageVector.Builder(
            name = "Filled.Save2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.89f, 5.879f)
                horizontalLineTo(5.11f)
                curveTo(3.4f, 5.879f, 2f, 7.279f, 2f, 8.989f)
                verticalLineTo(20.349f)
                curveTo(2f, 21.799f, 3.04f, 22.419f, 4.31f, 21.709f)
                lineTo(8.24f, 19.519f)
                curveTo(8.66f, 19.289f, 9.34f, 19.289f, 9.75f, 19.519f)
                lineTo(13.68f, 21.709f)
                curveTo(14.96f, 22.409f, 16f, 21.799f, 16f, 20.349f)
                verticalLineTo(8.989f)
                curveTo(16f, 7.279f, 14.6f, 5.879f, 12.89f, 5.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(22f, 17.92f, 20.96f, 18.53f, 19.69f, 17.83f)
                lineTo(17.76f, 16.75f)
                curveTo(17.6f, 16.66f, 17.5f, 16.49f, 17.5f, 16.31f)
                verticalLineTo(8.99f)
                curveTo(17.5f, 6.45f, 15.43f, 4.38f, 12.89f, 4.38f)
                horizontalLineTo(8.82f)
                curveTo(8.45f, 4.38f, 8.19f, 3.99f, 8.36f, 3.67f)
                curveTo(8.88f, 2.68f, 9.92f, 2f, 11.11f, 2f)
                horizontalLineTo(18.89f)
                curveTo(20.6f, 2f, 22f, 3.4f, 22f, 5.11f)
                close()
            }
        }.build()

        return _Save2!!
    }

@Suppress("ObjectPropertyName")
private var _Save2: ImageVector? = null
