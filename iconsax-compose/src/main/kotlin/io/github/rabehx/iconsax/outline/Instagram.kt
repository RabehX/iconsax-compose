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

val Iconsax.Outline.Instagram: ImageVector
    get() {
        if (_Instagram != null) {
            return _Instagram!!
        }
        _Instagram = ImageVector.Builder(
            name = "Outline.Instagram",
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
                moveTo(12f, 16.25f)
                curveTo(9.66f, 16.25f, 7.75f, 14.34f, 7.75f, 12f)
                curveTo(7.75f, 9.66f, 9.66f, 7.75f, 12f, 7.75f)
                curveTo(14.34f, 7.75f, 16.25f, 9.66f, 16.25f, 12f)
                curveTo(16.25f, 14.34f, 14.34f, 16.25f, 12f, 16.25f)
                close()
                moveTo(12f, 9.25f)
                curveTo(10.48f, 9.25f, 9.25f, 10.48f, 9.25f, 12f)
                curveTo(9.25f, 13.52f, 10.48f, 14.75f, 12f, 14.75f)
                curveTo(13.52f, 14.75f, 14.75f, 13.52f, 14.75f, 12f)
                curveTo(14.75f, 10.48f, 13.52f, 9.25f, 12f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 7.5f)
                curveTo(16.87f, 7.5f, 16.74f, 7.47f, 16.62f, 7.42f)
                curveTo(16.5f, 7.37f, 16.39f, 7.3f, 16.29f, 7.21f)
                curveTo(16.2f, 7.11f, 16.12f, 7f, 16.07f, 6.88f)
                curveTo(16.02f, 6.76f, 16f, 6.63f, 16f, 6.5f)
                curveTo(16f, 6.37f, 16.02f, 6.24f, 16.07f, 6.12f)
                curveTo(16.13f, 5.99f, 16.2f, 5.89f, 16.29f, 5.79f)
                curveTo(16.34f, 5.75f, 16.39f, 5.7f, 16.44f, 5.67f)
                curveTo(16.5f, 5.63f, 16.56f, 5.6f, 16.62f, 5.58f)
                curveTo(16.68f, 5.55f, 16.74f, 5.53f, 16.81f, 5.52f)
                curveTo(17.13f, 5.45f, 17.47f, 5.56f, 17.71f, 5.79f)
                curveTo(17.8f, 5.89f, 17.87f, 5.99f, 17.92f, 6.12f)
                curveTo(17.97f, 6.24f, 18f, 6.37f, 18f, 6.5f)
                curveTo(18f, 6.63f, 17.97f, 6.76f, 17.92f, 6.88f)
                curveTo(17.87f, 7f, 17.8f, 7.11f, 17.71f, 7.21f)
                curveTo(17.61f, 7.3f, 17.5f, 7.37f, 17.38f, 7.42f)
                curveTo(17.26f, 7.47f, 17.13f, 7.5f, 17f, 7.5f)
                close()
            }
        }.build()

        return _Instagram!!
    }

@Suppress("ObjectPropertyName")
private var _Instagram: ImageVector? = null
