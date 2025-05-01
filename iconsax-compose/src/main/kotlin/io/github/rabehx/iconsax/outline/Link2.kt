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

val Iconsax.Outline.Link2: ImageVector
    get() {
        if (_Link2 != null) {
            return _Link2!!
        }
        _Link2 = ImageVector.Builder(
            name = "Outline.Link2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.99f, 21.5f)
                curveTo(7.33f, 21.5f, 5.66f, 20.87f, 4.39f, 19.6f)
                curveTo(1.86f, 17.06f, 1.86f, 12.94f, 4.39f, 10.41f)
                curveTo(4.68f, 10.12f, 5.16f, 10.12f, 5.45f, 10.41f)
                curveTo(5.74f, 10.7f, 5.74f, 11.18f, 5.45f, 11.47f)
                curveTo(3.5f, 13.42f, 3.5f, 16.59f, 5.45f, 18.54f)
                curveTo(7.4f, 20.49f, 10.57f, 20.49f, 12.52f, 18.54f)
                curveTo(13.46f, 17.6f, 13.98f, 16.34f, 13.98f, 15f)
                curveTo(13.98f, 13.67f, 13.46f, 12.41f, 12.52f, 11.46f)
                curveTo(12.23f, 11.17f, 12.23f, 10.69f, 12.52f, 10.4f)
                curveTo(12.81f, 10.11f, 13.29f, 10.11f, 13.58f, 10.4f)
                curveTo(14.81f, 11.63f, 15.48f, 13.26f, 15.48f, 15f)
                curveTo(15.48f, 16.74f, 14.8f, 18.37f, 13.58f, 19.6f)
                curveTo(12.32f, 20.87f, 10.66f, 21.5f, 8.99f, 21.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.07f, 14.16f)
                curveTo(18.88f, 14.16f, 18.69f, 14.09f, 18.54f, 13.94f)
                curveTo(18.25f, 13.65f, 18.25f, 13.17f, 18.54f, 12.88f)
                curveTo(20.59f, 10.83f, 20.59f, 7.5f, 18.54f, 5.46f)
                curveTo(16.49f, 3.41f, 13.16f, 3.41f, 11.12f, 5.46f)
                curveTo(10.13f, 6.45f, 9.58f, 7.77f, 9.58f, 9.17f)
                curveTo(9.58f, 10.57f, 10.13f, 11.89f, 11.12f, 12.88f)
                curveTo(11.41f, 13.17f, 11.41f, 13.65f, 11.12f, 13.94f)
                curveTo(10.83f, 14.23f, 10.35f, 14.23f, 10.06f, 13.94f)
                curveTo(8.79f, 12.67f, 8.08f, 10.97f, 8.08f, 9.17f)
                curveTo(8.08f, 7.37f, 8.78f, 5.67f, 10.06f, 4.4f)
                curveTo(12.69f, 1.77f, 16.97f, 1.77f, 19.61f, 4.4f)
                curveTo(22.24f, 7.03f, 22.24f, 11.32f, 19.61f, 13.95f)
                curveTo(19.46f, 14.09f, 19.26f, 14.16f, 19.07f, 14.16f)
                close()
            }
        }.build()

        return _Link2!!
    }

@Suppress("ObjectPropertyName")
private var _Link2: ImageVector? = null
