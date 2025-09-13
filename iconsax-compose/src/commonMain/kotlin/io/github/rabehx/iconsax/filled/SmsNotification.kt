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


val Iconsax.Filled.SmsNotification: ImageVector
    get() {
        if (_SmsNotification != null) {
            return _SmsNotification!!
        }
        _SmsNotification = ImageVector.Builder(
            name = "Filled.SmsNotification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 8f)
                curveTo(20.881f, 8f, 22f, 6.881f, 22f, 5.5f)
                curveTo(22f, 4.119f, 20.881f, 3f, 19.5f, 3f)
                curveTo(18.119f, 3f, 17f, 4.119f, 17f, 5.5f)
                curveTo(17f, 6.881f, 18.119f, 8f, 19.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 8f)
                curveTo(20.881f, 8f, 22f, 6.881f, 22f, 5.5f)
                curveTo(22f, 4.119f, 20.881f, 3f, 19.5f, 3f)
                curveTo(18.119f, 3f, 17f, 4.119f, 17f, 5.5f)
                curveTo(17f, 6.881f, 18.119f, 8f, 19.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.72f, 9.31f)
                curveTo(20.02f, 9.53f, 19.25f, 9.57f, 18.45f, 9.37f)
                curveTo(17.11f, 9.02f, 16.02f, 7.95f, 15.65f, 6.61f)
                curveTo(15.47f, 5.96f, 15.46f, 5.32f, 15.57f, 4.74f)
                curveTo(15.7f, 4.1f, 15.25f, 3.5f, 14.61f, 3.5f)
                horizontalLineTo(7f)
                curveTo(4f, 3.5f, 2f, 5f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 19f, 4f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(20f, 20.5f, 22f, 19f, 22f, 15.5f)
                verticalLineTo(10.26f)
                curveTo(22f, 9.6f, 21.36f, 9.1f, 20.72f, 9.31f)
                close()
                moveTo(15.52f, 11.15f)
                lineTo(14.34f, 12.09f)
                curveTo(13.68f, 12.62f, 12.84f, 12.88f, 12f, 12.88f)
                curveTo(11.16f, 12.88f, 10.31f, 12.62f, 9.66f, 12.09f)
                lineTo(6.53f, 9.59f)
                curveTo(6.21f, 9.33f, 6.16f, 8.85f, 6.41f, 8.53f)
                curveTo(6.67f, 8.21f, 7.14f, 8.15f, 7.46f, 8.41f)
                lineTo(10.59f, 10.91f)
                curveTo(11.35f, 11.52f, 12.64f, 11.52f, 13.4f, 10.91f)
                lineTo(14.58f, 9.97f)
                curveTo(14.9f, 9.71f, 15.38f, 9.76f, 15.63f, 10.09f)
                curveTo(15.89f, 10.41f, 15.84f, 10.89f, 15.52f, 11.15f)
                close()
            }
        }.build()

        return _SmsNotification!!
    }

@Suppress("ObjectPropertyName")
private var _SmsNotification: ImageVector? = null
