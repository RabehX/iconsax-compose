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


val Iconsax.Filled.DollarSquare: ImageVector
    get() {
        if (_DollarSquare != null) {
            return _DollarSquare!!
        }
        _DollarSquare = ImageVector.Builder(
            name = "Filled.DollarSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.252f, 8.078f)
                verticalLineTo(10.938f)
                lineTo(10.242f, 10.588f)
                curveTo(9.732f, 10.408f, 9.422f, 10.238f, 9.422f, 9.368f)
                curveTo(9.422f, 8.658f, 9.952f, 8.078f, 10.602f, 8.078f)
                horizontalLineTo(11.252f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.58f, 14.629f)
                curveTo(14.58f, 15.339f, 14.05f, 15.919f, 13.4f, 15.919f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.059f)
                lineTo(13.76f, 13.409f)
                curveTo(14.27f, 13.589f, 14.58f, 13.759f, 14.58f, 14.629f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(14.26f, 12f)
                curveTo(15.04f, 12.27f, 16.08f, 12.84f, 16.08f, 14.63f)
                curveTo(16.08f, 16.17f, 14.88f, 17.42f, 13.4f, 17.42f)
                horizontalLineTo(12.75f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(17.42f)
                horizontalLineTo(10.89f)
                curveTo(9.25f, 17.42f, 7.92f, 16.03f, 7.92f, 14.33f)
                curveTo(7.92f, 13.92f, 8.25f, 13.58f, 8.67f, 13.58f)
                curveTo(9.08f, 13.58f, 9.42f, 13.92f, 9.42f, 14.33f)
                curveTo(9.42f, 15.21f, 10.08f, 15.92f, 10.89f, 15.92f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.53f)
                lineTo(9.74f, 12f)
                curveTo(8.96f, 11.73f, 7.92f, 11.16f, 7.92f, 9.37f)
                curveTo(7.92f, 7.83f, 9.12f, 6.58f, 10.6f, 6.58f)
                horizontalLineTo(11.25f)
                verticalLineTo(6f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6f)
                verticalLineTo(6.58f)
                horizontalLineTo(13.11f)
                curveTo(14.75f, 6.58f, 16.08f, 7.97f, 16.08f, 9.67f)
                curveTo(16.08f, 10.08f, 15.75f, 10.42f, 15.33f, 10.42f)
                curveTo(14.92f, 10.42f, 14.58f, 10.08f, 14.58f, 9.67f)
                curveTo(14.58f, 8.79f, 13.92f, 8.08f, 13.11f, 8.08f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.47f)
                lineTo(14.26f, 12f)
                close()
            }
        }.build()

        return _DollarSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DollarSquare: ImageVector? = null
