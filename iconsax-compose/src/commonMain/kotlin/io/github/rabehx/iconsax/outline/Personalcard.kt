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

val Iconsax.Outline.Personalcard: ImageVector
    get() {
        if (_Personalcard != null) {
            return _Personalcard!!
        }
        _Personalcard = ImageVector.Builder(
            name = "Outline.Personalcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 21.75f, 1.25f, 20.41f, 1.25f, 16f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.59f, 2.59f, 2.25f, 7f, 2.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 2.25f, 22.75f, 3.59f, 22.75f, 8f)
                verticalLineTo(16f)
                curveTo(22.75f, 20.41f, 21.41f, 21.75f, 17f, 21.75f)
                close()
                moveTo(7f, 3.75f)
                curveTo(3.42f, 3.75f, 2.75f, 4.43f, 2.75f, 8f)
                verticalLineTo(16f)
                curveTo(2.75f, 19.57f, 3.42f, 20.25f, 7f, 20.25f)
                horizontalLineTo(17f)
                curveTo(20.58f, 20.25f, 21.25f, 19.57f, 21.25f, 16f)
                verticalLineTo(8f)
                curveTo(21.25f, 4.43f, 20.58f, 3.75f, 17f, 3.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 8.75f, 13.25f, 8.41f, 13.25f, 8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 7.25f, 19.75f, 7.59f, 19.75f, 8f)
                curveTo(19.75f, 8.41f, 19.41f, 8.75f, 19f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 12.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 12.75f, 14.25f, 12.41f, 14.25f, 12f)
                curveTo(14.25f, 11.59f, 14.59f, 11.25f, 15f, 11.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 11.25f, 19.75f, 11.59f, 19.75f, 12f)
                curveTo(19.75f, 12.41f, 19.41f, 12.75f, 19f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 16.75f)
                horizontalLineTo(17f)
                curveTo(16.59f, 16.75f, 16.25f, 16.41f, 16.25f, 16f)
                curveTo(16.25f, 15.59f, 16.59f, 15.25f, 17f, 15.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 15.25f, 19.75f, 15.59f, 19.75f, 16f)
                curveTo(19.75f, 16.41f, 19.41f, 16.75f, 19f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 12.04f)
                curveTo(7.09f, 12.04f, 5.94f, 10.89f, 5.94f, 9.48f)
                curveTo(5.94f, 8.07f, 7.09f, 6.92f, 8.5f, 6.92f)
                curveTo(9.91f, 6.92f, 11.06f, 8.07f, 11.06f, 9.48f)
                curveTo(11.06f, 10.89f, 9.91f, 12.04f, 8.5f, 12.04f)
                close()
                moveTo(8.5f, 8.42f)
                curveTo(7.92f, 8.42f, 7.44f, 8.9f, 7.44f, 9.48f)
                curveTo(7.44f, 10.06f, 7.92f, 10.54f, 8.5f, 10.54f)
                curveTo(9.08f, 10.54f, 9.56f, 10.06f, 9.56f, 9.48f)
                curveTo(9.56f, 8.9f, 9.08f, 8.42f, 8.5f, 8.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.08f)
                curveTo(11.62f, 17.08f, 11.29f, 16.79f, 11.25f, 16.4f)
                curveTo(11.14f, 15.32f, 10.27f, 14.45f, 9.18f, 14.35f)
                curveTo(8.72f, 14.31f, 8.26f, 14.31f, 7.8f, 14.35f)
                curveTo(6.71f, 14.45f, 5.84f, 15.31f, 5.73f, 16.4f)
                curveTo(5.69f, 16.81f, 5.32f, 17.12f, 4.91f, 17.07f)
                curveTo(4.5f, 17.03f, 4.2f, 16.66f, 4.24f, 16.25f)
                curveTo(4.42f, 14.45f, 5.85f, 13.02f, 7.66f, 12.86f)
                curveTo(8.21f, 12.81f, 8.77f, 12.81f, 9.32f, 12.86f)
                curveTo(11.12f, 13.03f, 12.56f, 14.46f, 12.74f, 16.25f)
                curveTo(12.78f, 16.66f, 12.48f, 17.03f, 12.07f, 17.07f)
                curveTo(12.05f, 17.08f, 12.02f, 17.08f, 12f, 17.08f)
                close()
            }
        }.build()

        return _Personalcard!!
    }

@Suppress("ObjectPropertyName")
private var _Personalcard: ImageVector? = null
