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


val Iconsax.Filled.Sms: ImageVector
    get() {
        if (_Sms != null) {
            return _Sms!!
        }
        _Sms = ImageVector.Builder(
            name = "Filled.Sms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3.5f)
                horizontalLineTo(7f)
                curveTo(4f, 3.5f, 2f, 5f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 19f, 4f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(20f, 20.5f, 22f, 19f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 5f, 20f, 3.5f, 17f, 3.5f)
                close()
                moveTo(17.47f, 9.59f)
                lineTo(14.34f, 12.09f)
                curveTo(13.68f, 12.62f, 12.84f, 12.88f, 12f, 12.88f)
                curveTo(11.16f, 12.88f, 10.31f, 12.62f, 9.66f, 12.09f)
                lineTo(6.53f, 9.59f)
                curveTo(6.21f, 9.33f, 6.16f, 8.85f, 6.41f, 8.53f)
                curveTo(6.67f, 8.21f, 7.14f, 8.15f, 7.46f, 8.41f)
                lineTo(10.59f, 10.91f)
                curveTo(11.35f, 11.52f, 12.64f, 11.52f, 13.4f, 10.91f)
                lineTo(16.53f, 8.41f)
                curveTo(16.85f, 8.15f, 17.33f, 8.2f, 17.58f, 8.53f)
                curveTo(17.84f, 8.85f, 17.79f, 9.33f, 17.47f, 9.59f)
                close()
            }
        }.build()

        return _Sms!!
    }

@Suppress("ObjectPropertyName")
private var _Sms: ImageVector? = null
