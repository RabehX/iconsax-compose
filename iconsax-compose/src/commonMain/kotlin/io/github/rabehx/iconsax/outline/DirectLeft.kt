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

val Iconsax.Outline.DirectLeft: ImageVector
    get() {
        if (_DirectLeft != null) {
            return _DirectLeft!!
        }
        _DirectLeft = ImageVector.Builder(
            name = "Outline.DirectLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.81f, 22.06f)
                curveTo(17.18f, 22.06f, 16.55f, 21.91f, 15.95f, 21.59f)
                lineTo(4.36f, 15.49f)
                curveTo(3.06f, 14.81f, 2.25f, 13.47f, 2.25f, 12f)
                curveTo(2.25f, 10.53f, 3.06f, 9.19f, 4.36f, 8.51f)
                lineTo(15.95f, 2.41f)
                curveTo(17.5f, 1.6f, 19.3f, 1.86f, 20.55f, 3.08f)
                curveTo(21.8f, 4.3f, 22.1f, 6.1f, 21.32f, 7.66f)
                lineTo(19.7f, 10.9f)
                curveTo(19.36f, 11.58f, 19.36f, 12.4f, 19.7f, 13.09f)
                lineTo(21.32f, 16.33f)
                curveTo(22.1f, 17.89f, 21.8f, 19.69f, 20.55f, 20.91f)
                curveTo(19.78f, 21.67f, 18.81f, 22.06f, 17.81f, 22.06f)
                close()
                moveTo(17.8f, 3.44f)
                curveTo(17.44f, 3.44f, 17.05f, 3.53f, 16.65f, 3.74f)
                lineTo(5.06f, 9.84f)
                curveTo(4.24f, 10.27f, 3.75f, 11.08f, 3.75f, 12f)
                curveTo(3.75f, 12.92f, 4.24f, 13.73f, 5.06f, 14.16f)
                lineTo(16.65f, 20.26f)
                curveTo(17.81f, 20.87f, 18.89f, 20.45f, 19.5f, 19.84f)
                curveTo(20.12f, 19.24f, 20.56f, 18.17f, 19.98f, 17f)
                lineTo(18.36f, 13.76f)
                curveTo(17.81f, 12.65f, 17.81f, 11.34f, 18.36f, 10.23f)
                lineTo(19.98f, 6.99f)
                curveTo(20.57f, 5.82f, 20.12f, 4.75f, 19.5f, 4.15f)
                curveTo(19.1f, 3.76f, 18.5f, 3.44f, 17.8f, 3.44f)
                close()
            }
        }.build()

        return _DirectLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DirectLeft: ImageVector? = null
