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


val Iconsax.Filled.Coin1: ImageVector
    get() {
        if (_Coin1 != null) {
            return _Coin1!!
        }
        _Coin1 = ImageVector.Builder(
            name = "Filled.Coin1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.92f, 16.749f)
                curveTo(21.59f, 19.409f, 19.41f, 21.589f, 16.75f, 21.919f)
                curveTo(15.14f, 22.119f, 13.64f, 21.679f, 12.47f, 20.819f)
                curveTo(11.8f, 20.329f, 11.96f, 19.289f, 12.76f, 19.049f)
                curveTo(15.77f, 18.139f, 18.14f, 15.759f, 19.06f, 12.749f)
                curveTo(19.3f, 11.959f, 20.34f, 11.799f, 20.83f, 12.459f)
                curveTo(21.68f, 13.639f, 22.12f, 15.139f, 21.92f, 16.749f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 2f)
                curveTo(5.58f, 2f, 2f, 5.58f, 2f, 9.99f)
                curveTo(2f, 14.4f, 5.58f, 17.98f, 9.99f, 17.98f)
                curveTo(14.4f, 17.98f, 17.98f, 14.4f, 17.98f, 9.99f)
                curveTo(17.97f, 5.58f, 14.4f, 2f, 9.99f, 2f)
                close()
                moveTo(9.05f, 8.87f)
                lineTo(11.46f, 9.71f)
                curveTo(12.33f, 10.02f, 12.75f, 10.63f, 12.75f, 11.57f)
                curveTo(12.75f, 12.65f, 11.89f, 13.54f, 10.84f, 13.54f)
                horizontalLineTo(10.75f)
                verticalLineTo(13.59f)
                curveTo(10.75f, 14f, 10.41f, 14.34f, 10f, 14.34f)
                curveTo(9.59f, 14.34f, 9.25f, 14f, 9.25f, 13.59f)
                verticalLineTo(13.53f)
                curveTo(8.14f, 13.48f, 7.25f, 12.55f, 7.25f, 11.39f)
                curveTo(7.25f, 10.98f, 7.59f, 10.64f, 8f, 10.64f)
                curveTo(8.41f, 10.64f, 8.75f, 10.98f, 8.75f, 11.39f)
                curveTo(8.75f, 11.75f, 9.01f, 12.04f, 9.33f, 12.04f)
                horizontalLineTo(10.83f)
                curveTo(11.06f, 12.04f, 11.24f, 11.83f, 11.24f, 11.57f)
                curveTo(11.24f, 11.22f, 11.18f, 11.2f, 10.95f, 11.12f)
                lineTo(8.54f, 10.28f)
                curveTo(7.68f, 9.98f, 7.25f, 9.37f, 7.25f, 8.42f)
                curveTo(7.25f, 7.34f, 8.11f, 6.45f, 9.16f, 6.45f)
                horizontalLineTo(9.25f)
                verticalLineTo(6.41f)
                curveTo(9.25f, 6f, 9.59f, 5.66f, 10f, 5.66f)
                curveTo(10.41f, 5.66f, 10.75f, 6f, 10.75f, 6.41f)
                verticalLineTo(6.47f)
                curveTo(11.86f, 6.52f, 12.75f, 7.45f, 12.75f, 8.61f)
                curveTo(12.75f, 9.02f, 12.41f, 9.36f, 12f, 9.36f)
                curveTo(11.59f, 9.36f, 11.25f, 9.02f, 11.25f, 8.61f)
                curveTo(11.25f, 8.25f, 10.99f, 7.96f, 10.67f, 7.96f)
                horizontalLineTo(9.17f)
                curveTo(8.94f, 7.96f, 8.76f, 8.17f, 8.76f, 8.43f)
                curveTo(8.75f, 8.77f, 8.81f, 8.79f, 9.05f, 8.87f)
                close()
            }
        }.build()

        return _Coin1!!
    }

@Suppress("ObjectPropertyName")
private var _Coin1: ImageVector? = null
