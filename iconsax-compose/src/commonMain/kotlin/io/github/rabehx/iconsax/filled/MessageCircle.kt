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


val Iconsax.Filled.MessageCircle: ImageVector
    get() {
        if (_MessageCircle != null) {
            return _MessageCircle!!
        }
        _MessageCircle = ImageVector.Builder(
            name = "Filled.MessageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17.25f, 12.81f)
                curveTo(17.25f, 12.98f, 17.24f, 13.14f, 17.22f, 13.3f)
                curveTo(17.07f, 15.07f, 16.02f, 15.95f, 14.1f, 15.95f)
                horizontalLineTo(13.84f)
                curveTo(13.68f, 15.95f, 13.52f, 16.03f, 13.42f, 16.16f)
                lineTo(12.63f, 17.21f)
                curveTo(12.28f, 17.68f, 11.72f, 17.68f, 11.37f, 17.21f)
                lineTo(10.58f, 16.16f)
                curveTo(10.49f, 16.05f, 10.3f, 15.95f, 10.16f, 15.95f)
                horizontalLineTo(9.9f)
                curveTo(7.81f, 15.95f, 6.75f, 15.43f, 6.75f, 12.8f)
                verticalLineTo(10.17f)
                curveTo(6.75f, 8.25f, 7.64f, 7.2f, 9.4f, 7.05f)
                curveTo(9.56f, 7.04f, 9.73f, 7.04f, 9.9f, 7.04f)
                horizontalLineTo(14.1f)
                curveTo(16.19f, 7.04f, 17.25f, 8.09f, 17.25f, 10.19f)
                verticalLineTo(12.81f)
                close()
            }
        }.build()

        return _MessageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircle: ImageVector? = null
