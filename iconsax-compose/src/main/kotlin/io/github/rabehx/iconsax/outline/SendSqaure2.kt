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

val Iconsax.Outline.SendSqaure2: ImageVector
    get() {
        if (_SendSqaure2 != null) {
            return _SendSqaure2!!
        }
        _SendSqaure2 = ImageVector.Builder(
            name = "Outline.SendSqaure2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.83f, 12.68f)
                curveTo(14.42f, 12.68f, 14.08f, 12.34f, 14.08f, 11.93f)
                verticalLineTo(8.44f)
                horizontalLineTo(10.59f)
                curveTo(10.18f, 8.44f, 9.84f, 8.1f, 9.84f, 7.69f)
                curveTo(9.84f, 7.28f, 10.18f, 6.94f, 10.59f, 6.94f)
                horizontalLineTo(14.83f)
                curveTo(15.24f, 6.94f, 15.58f, 7.28f, 15.58f, 7.69f)
                verticalLineTo(11.93f)
                curveTo(15.58f, 12.34f, 15.24f, 12.68f, 14.83f, 12.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.169f, 14.09f)
                curveTo(8.979f, 14.09f, 8.789f, 14.02f, 8.639f, 13.87f)
                curveTo(8.349f, 13.58f, 8.349f, 13.1f, 8.639f, 12.81f)
                lineTo(14.299f, 7.15f)
                curveTo(14.589f, 6.86f, 15.069f, 6.86f, 15.359f, 7.15f)
                curveTo(15.649f, 7.44f, 15.649f, 7.92f, 15.359f, 8.21f)
                lineTo(9.699f, 13.87f)
                curveTo(9.559f, 14.02f, 9.359f, 14.09f, 9.169f, 14.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.23f)
                curveTo(9.89f, 18.23f, 7.77f, 17.89f, 5.76f, 17.22f)
                curveTo(5.37f, 17.09f, 5.16f, 16.66f, 5.29f, 16.27f)
                curveTo(5.42f, 15.88f, 5.85f, 15.66f, 6.24f, 15.8f)
                curveTo(9.96f, 17.04f, 14.05f, 17.04f, 17.77f, 15.8f)
                curveTo(18.16f, 15.67f, 18.59f, 15.88f, 18.72f, 16.27f)
                curveTo(18.85f, 16.66f, 18.64f, 17.09f, 18.25f, 17.22f)
                curveTo(16.23f, 17.9f, 14.11f, 18.23f, 12f, 18.23f)
                close()
            }
        }.build()

        return _SendSqaure2!!
    }

@Suppress("ObjectPropertyName")
private var _SendSqaure2: ImageVector? = null
