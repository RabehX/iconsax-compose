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

val Iconsax.Outline.SmsNotification: ImageVector
    get() {
        if (_SmsNotification != null) {
            return _SmsNotification!!
        }
        _SmsNotification = ImageVector.Builder(
            name = "Outline.SmsNotification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.25f)
                horizontalLineTo(7f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7f, 2.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 2.75f, 14.75f, 3.09f, 14.75f, 3.5f)
                curveTo(14.75f, 3.91f, 14.41f, 4.25f, 14f, 4.25f)
                horizontalLineTo(7f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7f, 19.75f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 10.09f, 21.59f, 9.75f, 22f, 9.75f)
                curveTo(22.41f, 9.75f, 22.75f, 10.09f, 22.75f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 12.87f)
                curveTo(11.159f, 12.87f, 10.309f, 12.61f, 9.659f, 12.08f)
                lineTo(6.529f, 9.58f)
                curveTo(6.209f, 9.32f, 6.149f, 8.85f, 6.409f, 8.53f)
                curveTo(6.669f, 8.21f, 7.139f, 8.15f, 7.459f, 8.41f)
                lineTo(10.589f, 10.91f)
                curveTo(11.349f, 11.52f, 12.639f, 11.52f, 13.399f, 10.91f)
                lineTo(14.579f, 9.97f)
                curveTo(14.899f, 9.71f, 15.379f, 9.76f, 15.629f, 10.09f)
                curveTo(15.889f, 10.41f, 15.839f, 10.89f, 15.509f, 11.14f)
                lineTo(14.329f, 12.08f)
                curveTo(13.689f, 12.61f, 12.839f, 12.87f, 11.999f, 12.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 8.75f)
                curveTo(17.71f, 8.75f, 16.25f, 7.29f, 16.25f, 5.5f)
                curveTo(16.25f, 3.71f, 17.71f, 2.25f, 19.5f, 2.25f)
                curveTo(21.29f, 2.25f, 22.75f, 3.71f, 22.75f, 5.5f)
                curveTo(22.75f, 7.29f, 21.29f, 8.75f, 19.5f, 8.75f)
                close()
                moveTo(19.5f, 3.75f)
                curveTo(18.54f, 3.75f, 17.75f, 4.54f, 17.75f, 5.5f)
                curveTo(17.75f, 6.46f, 18.54f, 7.25f, 19.5f, 7.25f)
                curveTo(20.46f, 7.25f, 21.25f, 6.46f, 21.25f, 5.5f)
                curveTo(21.25f, 4.54f, 20.46f, 3.75f, 19.5f, 3.75f)
                close()
            }
        }.build()

        return _SmsNotification!!
    }

@Suppress("ObjectPropertyName")
private var _SmsNotification: ImageVector? = null
