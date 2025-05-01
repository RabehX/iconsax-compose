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

val Iconsax.Outline.DirectDown: ImageVector
    get() {
        if (_DirectDown != null) {
            return _DirectDown!!
        }
        _DirectDown = ImageVector.Builder(
            name = "Outline.DirectDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.75f)
                curveTo(10.53f, 21.75f, 9.19f, 20.94f, 8.51f, 19.64f)
                lineTo(2.41f, 8.05f)
                curveTo(1.59f, 6.5f, 1.86f, 4.7f, 3.08f, 3.45f)
                curveTo(4.3f, 2.2f, 6.1f, 1.9f, 7.66f, 2.68f)
                lineTo(10.9f, 4.3f)
                curveTo(11.58f, 4.64f, 12.4f, 4.64f, 13.09f, 4.3f)
                lineTo(16.33f, 2.68f)
                curveTo(17.9f, 1.9f, 19.7f, 2.2f, 20.92f, 3.45f)
                curveTo(22.14f, 4.7f, 22.41f, 6.5f, 21.59f, 8.05f)
                lineTo(15.49f, 19.64f)
                curveTo(14.81f, 20.94f, 13.47f, 21.75f, 12f, 21.75f)
                close()
                moveTo(5.88f, 3.75f)
                curveTo(5.17f, 3.75f, 4.55f, 4.09f, 4.15f, 4.5f)
                curveTo(3.55f, 5.12f, 3.12f, 6.19f, 3.73f, 7.35f)
                lineTo(9.83f, 18.94f)
                curveTo(10.26f, 19.76f, 11.07f, 20.25f, 11.99f, 20.25f)
                curveTo(12.91f, 20.25f, 13.72f, 19.76f, 14.15f, 18.94f)
                lineTo(20.25f, 7.35f)
                curveTo(20.86f, 6.19f, 20.44f, 5.11f, 19.83f, 4.5f)
                curveTo(19.23f, 3.89f, 18.17f, 3.44f, 16.99f, 4.02f)
                lineTo(13.75f, 5.64f)
                curveTo(12.64f, 6.19f, 11.33f, 6.19f, 10.22f, 5.64f)
                lineTo(6.99f, 4.02f)
                curveTo(6.61f, 3.83f, 6.23f, 3.75f, 5.88f, 3.75f)
                close()
            }
        }.build()

        return _DirectDown!!
    }

@Suppress("ObjectPropertyName")
private var _DirectDown: ImageVector? = null
