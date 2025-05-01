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

val Iconsax.Outline.MessageEdit: ImageVector
    get() {
        if (_MessageEdit != null) {
            return _MessageEdit!!
        }
        _MessageEdit = ImageVector.Builder(
            name = "Outline.MessageEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.04f, 22.75f, 1.25f, 21.96f, 1.25f, 21f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(20.42f, 1.25f, 22.75f, 3.58f, 22.75f, 8f)
                verticalLineTo(16f)
                curveTo(22.75f, 20.42f, 20.42f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 2.75f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8f)
                verticalLineTo(21f)
                curveTo(2.75f, 21.14f, 2.86f, 21.25f, 3f, 21.25f)
                horizontalLineTo(16f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 16f)
                verticalLineTo(8f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.95f, 17.75f)
                curveTo(7.48f, 17.75f, 7.05f, 17.58f, 6.73f, 17.27f)
                curveTo(6.35f, 16.89f, 6.18f, 16.35f, 6.27f, 15.77f)
                lineTo(6.55f, 13.79f)
                curveTo(6.61f, 13.36f, 6.88f, 12.81f, 7.19f, 12.5f)
                lineTo(12.38f, 7.31f)
                curveTo(14.16f, 5.53f, 15.71f, 6.33f, 16.69f, 7.31f)
                curveTo(17.46f, 8.08f, 17.81f, 8.89f, 17.73f, 9.7f)
                curveTo(17.67f, 10.36f, 17.32f, 10.98f, 16.69f, 11.62f)
                lineTo(11.5f, 16.81f)
                curveTo(11.19f, 17.12f, 10.65f, 17.39f, 10.21f, 17.46f)
                lineTo(8.23f, 17.74f)
                curveTo(8.14f, 17.74f, 8.04f, 17.75f, 7.95f, 17.75f)
                close()
                moveTo(14.53f, 7.75f)
                curveTo(14.16f, 7.75f, 13.83f, 7.99f, 13.45f, 8.36f)
                lineTo(8.26f, 13.55f)
                curveTo(8.18f, 13.63f, 8.06f, 13.88f, 8.04f, 13.99f)
                lineTo(7.76f, 15.97f)
                curveTo(7.75f, 16.07f, 7.76f, 16.16f, 7.8f, 16.2f)
                curveTo(7.84f, 16.24f, 7.93f, 16.25f, 8.03f, 16.24f)
                lineTo(10.01f, 15.96f)
                curveTo(10.13f, 15.94f, 10.37f, 15.82f, 10.45f, 15.74f)
                lineTo(15.64f, 10.55f)
                curveTo(16.02f, 10.17f, 16.22f, 9.84f, 16.25f, 9.54f)
                curveTo(16.28f, 9.2f, 16.08f, 8.8f, 15.64f, 8.36f)
                curveTo(15.2f, 7.94f, 14.85f, 7.75f, 14.53f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.419f, 12.58f)
                curveTo(15.349f, 12.58f, 15.279f, 12.57f, 15.219f, 12.55f)
                curveTo(13.409f, 12.04f, 11.959f, 10.6f, 11.449f, 8.78f)
                curveTo(11.339f, 8.38f, 11.569f, 7.97f, 11.969f, 7.85f)
                curveTo(12.369f, 7.74f, 12.779f, 7.97f, 12.889f, 8.37f)
                curveTo(13.259f, 9.68f, 14.309f, 10.73f, 15.619f, 11.1f)
                curveTo(16.019f, 11.21f, 16.249f, 11.63f, 16.139f, 12.03f)
                curveTo(16.049f, 12.36f, 15.749f, 12.58f, 15.419f, 12.58f)
                close()
            }
        }.build()

        return _MessageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MessageEdit: ImageVector? = null
