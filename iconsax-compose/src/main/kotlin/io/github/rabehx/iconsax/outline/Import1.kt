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

val Iconsax.Outline.Import1: ImageVector
    get() {
        if (_Import1 != null) {
            return _Import1!!
        }
        _Import1 = ImageVector.Builder(
            name = "Outline.Import1",
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
                moveTo(12f, 15.63f)
                curveTo(11.59f, 15.63f, 11.25f, 15.29f, 11.25f, 14.88f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(14.88f)
                curveTo(12.75f, 15.3f, 12.41f, 15.63f, 12f, 15.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(11.81f, 16.75f, 11.62f, 16.68f, 11.47f, 16.53f)
                lineTo(8.12f, 13.18f)
                curveTo(7.83f, 12.89f, 7.83f, 12.41f, 8.12f, 12.12f)
                curveTo(8.41f, 11.83f, 8.89f, 11.83f, 9.18f, 12.12f)
                lineTo(12f, 14.94f)
                lineTo(14.82f, 12.12f)
                curveTo(15.11f, 11.83f, 15.59f, 11.83f, 15.88f, 12.12f)
                curveTo(16.17f, 12.41f, 16.17f, 12.89f, 15.88f, 13.18f)
                lineTo(12.53f, 16.53f)
                curveTo(12.38f, 16.68f, 12.19f, 16.75f, 12f, 16.75f)
                close()
            }
        }.build()

        return _Import1!!
    }

@Suppress("ObjectPropertyName")
private var _Import1: ImageVector? = null
