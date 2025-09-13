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

val Iconsax.Outline.Export1: ImageVector
    get() {
        if (_Export1 != null) {
            return _Export1!!
        }
        _Export1 = ImageVector.Builder(
            name = "Outline.Export1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.26f, 22.25f)
                horizontalLineTo(8.74f)
                curveTo(3.83f, 22.25f, 1.73f, 20.15f, 1.73f, 15.24f)
                verticalLineTo(15.11f)
                curveTo(1.73f, 10.67f, 3.48f, 8.53f, 7.4f, 8.16f)
                curveTo(7.8f, 8.13f, 8.18f, 8.43f, 8.22f, 8.84f)
                curveTo(8.26f, 9.25f, 7.96f, 9.62f, 7.54f, 9.66f)
                curveTo(4.4f, 9.95f, 3.23f, 11.43f, 3.23f, 15.12f)
                verticalLineTo(15.25f)
                curveTo(3.23f, 19.32f, 4.67f, 20.76f, 8.74f, 20.76f)
                horizontalLineTo(15.26f)
                curveTo(19.33f, 20.76f, 20.771f, 19.32f, 20.771f, 15.25f)
                verticalLineTo(15.12f)
                curveTo(20.771f, 11.41f, 19.58f, 9.93f, 16.381f, 9.66f)
                curveTo(15.97f, 9.62f, 15.66f, 9.26f, 15.7f, 8.85f)
                curveTo(15.741f, 8.44f, 16.09f, 8.13f, 16.51f, 8.17f)
                curveTo(20.49f, 8.51f, 22.271f, 10.66f, 22.271f, 15.13f)
                verticalLineTo(15.26f)
                curveTo(22.271f, 20.15f, 20.17f, 22.25f, 15.26f, 22.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(11.59f, 15.75f, 11.25f, 15.41f, 11.25f, 15f)
                verticalLineTo(3.62f)
                curveTo(11.25f, 3.21f, 11.59f, 2.87f, 12f, 2.87f)
                curveTo(12.41f, 2.87f, 12.75f, 3.21f, 12.75f, 3.62f)
                verticalLineTo(15f)
                curveTo(12.75f, 15.41f, 12.41f, 15.75f, 12f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.35f, 6.6f)
                curveTo(15.16f, 6.6f, 14.97f, 6.53f, 14.82f, 6.38f)
                lineTo(12f, 3.56f)
                lineTo(9.18f, 6.38f)
                curveTo(8.89f, 6.67f, 8.41f, 6.67f, 8.12f, 6.38f)
                curveTo(7.83f, 6.09f, 7.83f, 5.61f, 8.12f, 5.32f)
                lineTo(11.47f, 1.97f)
                curveTo(11.76f, 1.68f, 12.24f, 1.68f, 12.53f, 1.97f)
                lineTo(15.88f, 5.32f)
                curveTo(16.17f, 5.61f, 16.17f, 6.09f, 15.88f, 6.38f)
                curveTo(15.74f, 6.53f, 15.54f, 6.6f, 15.35f, 6.6f)
                close()
            }
        }.build()

        return _Export1!!
    }

@Suppress("ObjectPropertyName")
private var _Export1: ImageVector? = null
