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

val Iconsax.Outline.UserMinus: ImageVector
    get() {
        if (_UserMinus != null) {
            return _UserMinus!!
        }
        _UserMinus = ImageVector.Builder(
            name = "Outline.UserMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12.75f)
                curveTo(8.83f, 12.75f, 6.25f, 10.17f, 6.25f, 7f)
                curveTo(6.25f, 3.83f, 8.83f, 1.25f, 12f, 1.25f)
                curveTo(15.17f, 1.25f, 17.75f, 3.83f, 17.75f, 7f)
                curveTo(17.75f, 10.17f, 15.17f, 12.75f, 12f, 12.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.66f, 2.75f, 7.75f, 4.66f, 7.75f, 7f)
                curveTo(7.75f, 9.34f, 9.66f, 11.25f, 12f, 11.25f)
                curveTo(14.34f, 11.25f, 16.25f, 9.34f, 16.25f, 7f)
                curveTo(16.25f, 4.66f, 14.34f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.41f, 22.75f)
                curveTo(3f, 22.75f, 2.66f, 22.41f, 2.66f, 22f)
                curveTo(2.66f, 17.73f, 6.85f, 14.25f, 12f, 14.25f)
                curveTo(13.01f, 14.25f, 14f, 14.38f, 14.96f, 14.65f)
                curveTo(15.36f, 14.76f, 15.59f, 15.17f, 15.48f, 15.57f)
                curveTo(15.37f, 15.97f, 14.96f, 16.2f, 14.56f, 16.09f)
                curveTo(13.74f, 15.86f, 12.88f, 15.75f, 12f, 15.75f)
                curveTo(7.68f, 15.75f, 4.16f, 18.55f, 4.16f, 22f)
                curveTo(4.16f, 22.41f, 3.82f, 22.75f, 3.41f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 22.75f)
                curveTo(16.82f, 22.75f, 15.7f, 22.31f, 14.83f, 21.52f)
                curveTo(14.48f, 21.22f, 14.17f, 20.85f, 13.93f, 20.44f)
                curveTo(13.49f, 19.72f, 13.25f, 18.87f, 13.25f, 18f)
                curveTo(13.25f, 16.75f, 13.73f, 15.58f, 14.59f, 14.69f)
                curveTo(15.49f, 13.76f, 16.7f, 13.25f, 18f, 13.25f)
                curveTo(19.36f, 13.25f, 20.65f, 13.83f, 21.53f, 14.83f)
                curveTo(22.31f, 15.7f, 22.75f, 16.82f, 22.75f, 18f)
                curveTo(22.75f, 18.38f, 22.7f, 18.76f, 22.6f, 19.12f)
                curveTo(22.5f, 19.57f, 22.31f, 20.04f, 22.05f, 20.45f)
                curveTo(21.22f, 21.87f, 19.66f, 22.75f, 18f, 22.75f)
                close()
                moveTo(18f, 14.75f)
                curveTo(17.11f, 14.75f, 16.29f, 15.1f, 15.67f, 15.73f)
                curveTo(15.08f, 16.34f, 14.75f, 17.14f, 14.75f, 18f)
                curveTo(14.75f, 18.59f, 14.91f, 19.17f, 15.22f, 19.67f)
                curveTo(15.38f, 19.95f, 15.59f, 20.2f, 15.83f, 20.41f)
                curveTo(16.43f, 20.96f, 17.2f, 21.26f, 18f, 21.26f)
                curveTo(19.13f, 21.26f, 20.2f, 20.66f, 20.78f, 19.69f)
                curveTo(20.95f, 19.41f, 21.08f, 19.09f, 21.15f, 18.78f)
                curveTo(21.22f, 18.52f, 21.25f, 18.27f, 21.25f, 18.01f)
                curveTo(21.25f, 17.21f, 20.95f, 16.44f, 20.41f, 15.84f)
                curveTo(19.81f, 15.14f, 18.93f, 14.75f, 18f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 18.73f)
                horizontalLineTo(16.51f)
                curveTo(16.1f, 18.73f, 15.76f, 18.39f, 15.76f, 17.98f)
                curveTo(15.76f, 17.57f, 16.1f, 17.23f, 16.51f, 17.23f)
                horizontalLineTo(19.5f)
                curveTo(19.91f, 17.23f, 20.25f, 17.57f, 20.25f, 17.98f)
                curveTo(20.25f, 18.39f, 19.91f, 18.73f, 19.5f, 18.73f)
                close()
            }
        }.build()

        return _UserMinus!!
    }

@Suppress("ObjectPropertyName")
private var _UserMinus: ImageVector? = null
