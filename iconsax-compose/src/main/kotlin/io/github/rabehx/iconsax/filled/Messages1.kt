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


val Iconsax.Filled.Messages1: ImageVector
    get() {
        if (_Messages1 != null) {
            return _Messages1!!
        }
        _Messages1 = ImageVector.Builder(
            name = "Filled.Messages1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.19f, 6f)
                horizontalLineTo(6.79f)
                curveTo(6.53f, 6f, 6.28f, 6.01f, 6.04f, 6.04f)
                curveTo(3.35f, 6.27f, 2f, 7.86f, 2f, 10.79f)
                verticalLineTo(14.79f)
                curveTo(2f, 18.79f, 3.6f, 19.58f, 6.79f, 19.58f)
                horizontalLineTo(7.19f)
                curveTo(7.41f, 19.58f, 7.7f, 19.73f, 7.83f, 19.9f)
                lineTo(9.03f, 21.5f)
                curveTo(9.56f, 22.21f, 10.42f, 22.21f, 10.95f, 21.5f)
                lineTo(12.15f, 19.9f)
                curveTo(12.3f, 19.7f, 12.54f, 19.58f, 12.79f, 19.58f)
                horizontalLineTo(13.19f)
                curveTo(16.12f, 19.58f, 17.71f, 18.24f, 17.94f, 15.54f)
                curveTo(17.97f, 15.3f, 17.98f, 15.05f, 17.98f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(17.98f, 7.6f, 16.38f, 6f, 13.19f, 6f)
                close()
                moveTo(6.5f, 14f)
                curveTo(5.94f, 14f, 5.5f, 13.55f, 5.5f, 13f)
                curveTo(5.5f, 12.45f, 5.95f, 12f, 6.5f, 12f)
                curveTo(7.05f, 12f, 7.5f, 12.45f, 7.5f, 13f)
                curveTo(7.5f, 13.55f, 7.05f, 14f, 6.5f, 14f)
                close()
                moveTo(9.99f, 14f)
                curveTo(9.43f, 14f, 8.99f, 13.55f, 8.99f, 13f)
                curveTo(8.99f, 12.45f, 9.44f, 12f, 9.99f, 12f)
                curveTo(10.54f, 12f, 10.99f, 12.45f, 10.99f, 13f)
                curveTo(10.99f, 13.55f, 10.55f, 14f, 9.99f, 14f)
                close()
                moveTo(13.49f, 14f)
                curveTo(12.93f, 14f, 12.49f, 13.55f, 12.49f, 13f)
                curveTo(12.49f, 12.45f, 12.94f, 12f, 13.49f, 12f)
                curveTo(14.04f, 12f, 14.49f, 12.45f, 14.49f, 13f)
                curveTo(14.49f, 13.55f, 14.04f, 14f, 13.49f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.98f, 6.79f)
                verticalLineTo(10.79f)
                curveTo(21.98f, 12.79f, 21.36f, 14.15f, 20.12f, 14.9f)
                curveTo(19.82f, 15.08f, 19.47f, 14.84f, 19.47f, 14.49f)
                lineTo(19.48f, 10.79f)
                curveTo(19.48f, 6.79f, 17.19f, 4.5f, 13.19f, 4.5f)
                lineTo(7.1f, 4.51f)
                curveTo(6.75f, 4.51f, 6.51f, 4.16f, 6.69f, 3.86f)
                curveTo(7.44f, 2.62f, 8.8f, 2f, 10.79f, 2f)
                horizontalLineTo(17.19f)
                curveTo(20.38f, 2f, 21.98f, 3.6f, 21.98f, 6.79f)
                close()
            }
        }.build()

        return _Messages1!!
    }

@Suppress("ObjectPropertyName")
private var _Messages1: ImageVector? = null
